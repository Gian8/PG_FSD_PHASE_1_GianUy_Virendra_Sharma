package Threads;

public class DeadlockPractice {
	
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String args[]) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();
	}
	
	private static class Thread1 extends Thread {
		
		public void run() {
			synchronized(Lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(15);
				}
				catch(InterruptedException e) {}
				System.out.println("Thread 1: Wait for lock 2...");
				synchronized(Lock2) {
					System.out.println("Thread 1: hold lock 1 & 2");
				}
			}
		}
	}
	
	public static class Thread2 extends Thread {
		
		public void run() {
			synchronized(Lock2) {
				System.out.println("Thread2: Holding lock 2...");
				try {
					Thread.sleep(10);
				} catch(InterruptedException e) {					
				} System.out.println("Thread 2: Wait for lock 1...");
				synchronized(Lock1) {
					System.out.println("Thread 2: Hold lock 1 & 2");
				}
			}
		}
	}

}
