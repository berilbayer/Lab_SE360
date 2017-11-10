package object_counting_se360;

public class ObjectCount {

	public static class MovieTheater{
		MovieTheater(){
			System.out.println("Default constructor is called");
			this.chairCapacity = 0;
			this.ticketPrice = 0;
			soldTicketCount = soldTicketCount + 1 ;
		}
		MovieTheater(int x,int y){
			System.out.println("Parameterized constructor is called");
			this.chairCapacity = x;
			this.ticketPrice = y;
			soldTicketCount = soldTicketCount + 1;
		}
    protected void finalize() throws Throwable{
    	soldTicketCount = soldTicketCount - 1;
    	System.out.println("Finalize called:" + soldTicketCount);
    	
    }
    public static int soldTicketCount = 0 ;
	private int chairCapacity;
	private int ticketPrice;
	public int getCapacity(){
		return this.chairCapacity;
	}
	public void setCapacity(int cap){
		this.chairCapacity = cap;
	}
	public int getTicketPrice(){
		return this.ticketPrice;
	}
	public void setTicketPrice(int price){
		this.ticketPrice = price;
	}
	public void print(){
		System.out.println("The chair capacity is:" + this.chairCapacity);
		System.out.println("The ticket price is:" + this.ticketPrice);
	}
}
	
	
}
