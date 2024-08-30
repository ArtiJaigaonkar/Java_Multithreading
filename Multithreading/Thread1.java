package Multithreading;

public class Thread1 extends Thread{   //extending thread class
	
	public static void main(String[] args) {
		Thread1 th=new Thread1();
		th.start();
		System.out.println("Thread one");
		
	}
	
	public void run() {
		System.out.println("Thread two");
	}
}

	
//	public void run() {   //override method
//		System.out.println("Thread one");
//	}
//	
//	public static void main(String[]args) {
//		System.out.println("Thread Two");
//		Thread1 th=new Thread1();
//		th.start();    //call th start method
//	}
//
//}
