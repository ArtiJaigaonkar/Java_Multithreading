package Multithreading;

public class MyEarnings extends Thread{
	int earnings=0;
	public void run() {
		synchronized(this) {
			
		for(int i=1;i<=10;i++) {
			earnings+=100;
		}
		this.notify();
		}
		
	}
	public static void main(String[] args) throws InterruptedException{
		MyEarnings th=new MyEarnings();
		th.start();
		
		synchronized(th){
			th.wait();
		System.out.println("My earning: "+th.earnings);
	}
	}
}
