package Multithreading;

public class BookingApp extends Thread{
	static TicketBooking th;
	public void run() {
		th.bookseats(4);
		
		System.out.println("This is Thread");
		
	}
	public static void main(String[] args) {

     th=new TicketBooking();
     
     BookingApp th=new BookingApp();
     th.start();
     
     BookingApp th1=new BookingApp();
     th1.start();
     
     BookingApp th2=new BookingApp();
     th2.start();
     
		TicketBooking obj=new TicketBooking();
		
	}

}
