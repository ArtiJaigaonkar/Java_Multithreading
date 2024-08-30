package Multithreading;
 
class Test1 extends Thread{
	public void run() {
	     for(int i=1; i<=5; i++) {
				
				try {
					
					Thread.sleep(1000);
					System.out.println("Arti"+currentThread().getName());
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}
public class SuspendThread extends Thread{
	public void run() {
     for(int i=1; i<=5; i++) {
			
			try {
				
				Thread.sleep(1000);
				System.out.println("Aboli"+currentThread().getName());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


//		System.out.println(Thread.currentThread().getName());
	
	public static void main(String[] args) {
		SuspendThread th=new SuspendThread();
		th.start();
		
		Test1 th1=new Test1();
		th1.start();
		th1.suspend();
		th1.resume();
		
		
		
	}
	}


