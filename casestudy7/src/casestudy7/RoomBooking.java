package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
 class RoomBooking {
	 public static int regid=0;
	 
	public static void main(String[] args)throws IOException {
		
		
Booking b=new Booking();

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int choice;
String sd=" ";
		
		
		do
		{
		System.out.println("Enter your choice\n1:Book\n2:Exit");
		choice=Integer.parseInt(br.readLine());
		
		
		switch(choice)
		{
		case 1:
		 sd= Regisstration.register();
		 if(sd.equalsIgnoreCase("y"));
			{
			b.book();
			}
			break;
		
		case 2:
			System.exit(0);
			break;
		}
		}while(choice!=2);


	}

}
