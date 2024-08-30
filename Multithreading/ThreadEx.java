package Multithreading;

class ThraedEx1 extends Thread{
	public void run() {
		for(int i=1; i<=5; i++) {
			
		
		try {
			Thread.sleep(1000);
			System.out.println("This is Thread2: " +i);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}

	}
}
public class ThreadEx extends Thread{
	public void run() {
		
	for(int i=1; i<=5; i++) {
		
		
	try {
		Thread.sleep(1000);
		System.out.println("This is Thread1: " +i);
	}
	catch(Exception e) {
		e.printStackTrace();
	
		
	}
	}
	}
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());//main thread
		
		ThreadEx th=new ThreadEx();//child thread
		th.start();
		
		ThreadEx th1=new ThreadEx();//child thread
		th1.start();
		
		ThreadEx Ex1=new ThreadEx();//child thread
		Ex1.start();
	}
	

}
