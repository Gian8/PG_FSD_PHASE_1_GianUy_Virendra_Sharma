package Threads;

class Customer2 {
	int amount = 10000;
	synchronized void t1Withdraws(int amount) {
		System.out.println("T1 is going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Insufficient fund, please deposit first...");
		}
		this.amount -= amount;
		System.out.println("T1 has completed the withdrawal of 5,000... Remaining balance is now " + this.amount);
	}
	synchronized void t2Withdraws(int amount) {
		System.out.println("T2 is going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Insufficient fund, please deposit first...");			
		}
		this.amount -= amount;
		System.out.println("T2 has completed the withdrawal of 4,000... Remaining balance is now " + this.amount);
	}
	synchronized void t3Withdraws(int amount) {
		System.out.println("T3 is going to withdraw...");
		if(this.amount<amount) {
			System.out.println("Insufficient fund, please deposit first...");
			try {
				wait();
			}
			catch(Exception e) {}
		}
		this.amount -= amount;
		System.out.println("T3 has completed the withdrawal of 10,000... Remaining balance is now " + this.amount);
	}
	synchronized void t4Deposits(int amount) {
		System.out.println("T4 is going to deposit...");
		this.amount += amount;
		System.out.println("T4 has deposited successfully! New account balance is " + this.amount);		
		notifyAll();
	}
}

public class WaitNotifyAssignment {
	public static void main(String args[]) {
		final Customer2 c = new Customer2();
		System.out.println("Current balance is: " + c.amount);
		new Thread() {
			public void run() {
			c.t1Withdraws(5000);
			}
		}.start();
		new Thread() {
			public void run() {
			c.t2Withdraws(4000);
			}
		}.start();
		new Thread() {
			public void run() {
			c.t3Withdraws(10000);
			}
		}.start();
		new Thread() {
			public void run() {
			c.t4Deposits(20000);
			}
		}.start();
	}
}
