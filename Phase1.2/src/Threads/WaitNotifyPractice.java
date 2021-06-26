package Threads;

class Customer {
	int amount = 10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Insufficient funds, waiting for deposit...");
		try {
			wait();
		}
		catch(Exception e) {}
		}
		this.amount -= amount;
		System.out.println("withdraw completed... remaining balance is " + this.amount);
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed! New account balance is " + this.amount);
		notify();
	}
}

public class WaitNotifyPractice {
	public static void main(String args[]) {
		final Customer c = new Customer();
		
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				c.deposit(20000);
			}
		}.start();
	}

}
