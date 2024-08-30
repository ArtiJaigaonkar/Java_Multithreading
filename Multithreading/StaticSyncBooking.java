package Multithreading;

public class StaticSyncBooking extends Thread{
	private int seats;
	private TicketBooking tk;
	
	public StaticSyncBooking(int seats,TicketBooking tk) {
	super();
	this.seats = seats;
	this.tk=tk;
}

	public void run(){
		tk.bookseats(seats);
		
		System.out.println("Thread.currentThread().getName");
		}
	public static void main(String[] args) {
		TicketBooking obj1=new TicketBooking();
		StaticSyncBooking th=new StaticSyncBooking(6,obj1);
		th.start();
		
	}
	

}

