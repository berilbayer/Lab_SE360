package object_counting_se360;

import object_counting_se360.ObjectCount.MovieTheater;

public class Test {
	
		public static void main(String args[]){
			MovieTheater harryPotter1 = new MovieTheater(90,15);
			MovieTheater harryPotter2 = new MovieTheater();
			int x,y;
			harryPotter2.setCapacity(95);
			x = harryPotter2.getCapacity();
			harryPotter2.setTicketPrice(15);
			y = harryPotter2.getTicketPrice();
			System.out.println(x);
			System.out.println(y);
			harryPotter1.getCapacity();
			harryPotter1.getTicketPrice();
			harryPotter1.print();
			System.out.println(MovieTheater.soldTicketCount);
			harryPotter1 = null;
			harryPotter2 = null;
			
			MovieTheater[] movies = new MovieTheater[10];
			for(int i = 0; i<10; i++){
				movies[i] = new MovieTheater(60,15);
			}
			
			
		}
}
