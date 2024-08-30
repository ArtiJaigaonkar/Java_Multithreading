package Multithreading;

public class TicketBooking {
	int tkt=10;
	public synchronized void bookseats(int seats) {
//		System.out.println("This is Arti");
//		System.out.println("This is Aditi");
//		System.out.println("This is Aboli");
//		System.out.println("This is sounu");
//	
//	    synchronized(this) {
		
		if(tkt>=seats){
			System.out.println(seats+" tickets are booked successfully" );
			tkt-=seats;
			System.out.println(tkt+" tickets are available");
		}
		else {
			System.out.println(seats+" tickets are not available" );
			System.out.println(tkt+" tickets are available");
		}
	}

	
	public static void main(String[] args) {
		TicketBooking obj=new TicketBooking();
		obj.bookseats(4); //6=10-4
		obj.bookseats(5);//1=6-5
		obj.bookseats(3);//1-3
		
		}

}
