package Multithreading;

public class DeamonThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		
	}
	
	public static void main(String[] args) {
		DeamonThread dt=new DeamonThread();
		dt.setDaemon(true);                     //second thread backgroung run  spelling check
		System.out.println("This is Daemon");    
		dt.start();
	}

}
