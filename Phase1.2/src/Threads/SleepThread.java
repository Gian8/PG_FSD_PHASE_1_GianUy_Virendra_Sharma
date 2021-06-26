package Threads;

public class SleepThread extends Thread {
	
	public void run() {
		for(int i = 1; i < 5; i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " :" + i);
			System.out.println("Running thread name is: " + Thread.currentThread().getName());
			System.out.println("Priority of it is: " + Thread.currentThread().getName()+ " :::" + Thread.currentThread().getPriority());
			System.out.println("State of thread is: " + Thread.currentThread().getName() + " :::" + Thread.currentThread().getState());
			System.out.println("Thread group is: " + Thread.currentThread().getName() + " :::" + Thread.currentThread().getThreadGroup());
			System.out.println("Thread ID is: " + Thread.currentThread().getName() + " :::" + Thread.currentThread().getId());
			System.out.println("Is current thread alive? : " + Thread.currentThread().getName() + " :::" + Thread.currentThread().isAlive());
			System.out.println("Is current thread Daemon? : " + Thread.currentThread().getName() + " :::" + Thread.currentThread().isDaemon());

		}
	}
	public static void main(String args[]) {
		SleepThread t1 = new SleepThread();
		t1.setName("Java");
		
		SleepThread t2 = new SleepThread();
		t2.setName("Python");
		t2.setPriority(MAX_PRIORITY);
		SleepThread t3 = new SleepThread();
		t3.setName("Oracle");
		
		SleepThread t4 = new SleepThread();
		t4.setName("C++");
		//t4.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		
	}

}
