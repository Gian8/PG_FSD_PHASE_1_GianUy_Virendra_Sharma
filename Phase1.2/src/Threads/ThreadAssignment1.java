package Threads;

public class ThreadAssignment1 extends Thread{

	public void run() {
		for(int i = 1; i < 5; i++) {
			try {
				Thread.sleep(900);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Is current thread alive? : " + Thread.currentThread().getName() + " :::" + Thread.currentThread().isAlive());
			System.out.println("Is current thread Daemon? : " + Thread.currentThread().getName() + " :::" + Thread.currentThread().isDaemon());
			System.out.println("Status of current thread: " + Thread.currentThread().getName() + " :::" + Thread.currentThread().getState());
			System.out.println("ID of current thread: " + Thread.currentThread().getName() + " :::" + Thread.currentThread().getId());
		}
	}
	
	public static void main(String args[]) {
		
		ThreadAssignment1 t1 = new ThreadAssignment1();
		ThreadAssignment1 t2 = new ThreadAssignment1();
		ThreadAssignment1 t3 = new ThreadAssignment1();
		ThreadAssignment1 t4 = new ThreadAssignment1();
		
		t1.setName("Shrek");
		t1.setPriority(MIN_PRIORITY);
		t2.setName("Lord Farquad");
		t2.setPriority(MIN_PRIORITY);
		t2.setDaemon(true);
		t3.setName("Donkey");
		t3.setPriority(NORM_PRIORITY);
		t4.setName("Fyona");
		t4.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
}
