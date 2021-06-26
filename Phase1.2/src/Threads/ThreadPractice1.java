package Threads;

public class ThreadPractice1 implements Runnable {
	
	int i;
	
	public void run () {
		System.out.println("Thread is running...");
		i = 0;
		while(true) {
			System.out.println("Printing Thread: " + i++);
			if(i==4) {
				break;
			}
		}		
	}
	
	public static void main(String args[]) {
		ThreadPractice1 r = new ThreadPractice1();
		Thread t1 = new Thread(r);
		t1.start();
	}

}
