package Multithreading;

public class IntruptedThread extends Thread{
	public void run() {
//		for(int i=1;i<=2;i++) {
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.currentThread().interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		IntruptedThread it=new IntruptedThread();
		it.start();
		it.interrupt();
	}

}
