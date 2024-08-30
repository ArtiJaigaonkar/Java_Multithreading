package Multithreading;

public class Thread2 extends Thread{
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println("Aditi");
		}
	}

	public static void main(String[]args) {
		 
		 Thread2 t1=new Thread2();
		 t1.start();
	 }
 }

