package Threads;

class Bankroles {
	int amount = 10000;	
	int withdrawn;
	synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Insufficient fund, please deposit first...");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		this.amount -= amount;
		System.out.println(Thread.currentThread().getName() + " has completed the withdrawal... Remaining balance is now " + this.amount);
	}
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to deposit...");
		this.amount += amount;
		System.out.println(Thread.currentThread().getName() + " has deposited successfully! New account balance is " + this.amount);		
		notify();
	}
}
class T1 extends Thread {
	Bankroles b;
	T1(Bankroles b){
		this.b = b;
	}
	public void run() {		
		b.withdraw(5000);
	}
}
class T2 extends Thread {
	Bankroles b;
	T2(Bankroles b){
		this.b = b;
	}
	public void run() {
		b.withdraw(4000);
	}
}
class T3 extends Thread {
	Bankroles b;
	T3(Bankroles b){
		this.b = b;
	}
	public void run() {
		b.withdraw(10000);
	}
}class T4 extends Thread {
	Bankroles b;
	T4(Bankroles b){
		this.b = b;
	}
	public void run() {
		b.deposit(20000);
	}
}
public class ThreadAssignment2 {
	public static void main(String args[]) {
		Bankroles g = new Bankroles();
		T1 t1 = new T1(g);
		T2 t2 = new T2(g);
		T3 t3 = new T3(g);
		T4 t4 = new T4(g);
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t4.setName("T4");
		
		System.out.println("Starting balance is: " + g.amount);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
