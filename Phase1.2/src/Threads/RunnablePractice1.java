package Threads;

public class RunnablePractice1 {

	public static void main(String args[]) {
		
		HelloRunner r = new HelloRunner();
		Thread t = new Thread(r);
		t.start();
	}
}

class HelloRunner implements Runnable {
	
	int i;
	
	public void run() {
		i=0;
		while(true) {
			System.out.println("Hello" + i++);
			if (i==6) {
				break;
		}
		}
	}
}
