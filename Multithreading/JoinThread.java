package Multithreading;

public class JoinThread extends Thread{
	static Thread main;
	public void run() {
		for(int i=1; i<=4; i++) {
			
			try {
				main.join();
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		JoinThread th=new JoinThread();
		th.start();
		
	//th.join
    for(int i=1; i<=4; i++) {
	System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	}
		
	


