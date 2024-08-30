package Multithreading;

public class RunnableEx implements Runnable {
	public void run() {
		
		
		System.out.println("This is Runnable");
	}
	
	public static void main(String[] args) {
		
		RunnableEx rn=new RunnableEx();
		
		Thread th=new Thread(rn);
		th.start();
	}
	

}
