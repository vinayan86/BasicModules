package casestudy3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BookedRoom {
	public static int room[]=new int[25];
	
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		
		do
		{
		System.out.println("Enter your choice\n1:Book\n2:CheckStatus\n3:Exit");
		choice=Integer.parseInt(br.readLine());
		
		
		switch(choice)
		{
		case 1:
		    book();
			break;
		case 2:
			checkStatus();
			break;
		case 3:
			System.exit(0);
			break;
		}
		}while(choice!=3);
	}

	private static void checkStatus() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter room number");
		int rNumber=Integer.parseInt(br.readLine());
		for(int i=1;i<=25;i++)
		{
			if((rNumber==i)&&(room[i]==1))
			{
				System.out.println("Room number "+ rNumber +" is booked");
				break;
				
			}
			else if((rNumber==i)&&(room[i]==0))
			{
				System.out.println("Room number "+ rNumber +" is not booked.");
				break;
				
			}
			else
			{
				System.out.println("You Entered wrong Room Number");
				break;
			}
		}
		
	}

	public static void book() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int total=0;
		String nc=" ",nw=" ",lf=" ";
		System.out.println("Please choose the services required\nAC/non-AC(AC or nAC)");
		String ac=br.readLine();
		
		if(ac.compareTo("AC")==0)
		{
			total=total+500;
			ac="AC";
		}
		else if(ac.compareTo("nAC")==0)
		{
			
			total=total+250;
			ac="NON-AC";
		}
		else
			ac="NULL";
		System.out.println("Cot(Single/Double)");
		String cot=br.readLine();
		if(cot.compareTo("Single")==0)
			total=total+500;
		else if(cot.compareTo("Double")==0)
			total=total+250;
		else
			cot="NULL";
		System.out.println("With cable connection/without cable connection(c OR nc)");
		String cable=br.readLine();
		if(cable.compareTo("c")==0)
			total=total+500;
		else if(cable.compareTo("nc")==0)
			nc="Not";
		else
			cable="NULL";
		System.out.println("Wi-Fi needed or not(w OR nW)");
		String wifi=br.readLine();
		if(wifi.compareTo("w")==0)
			total=total+500;
		else if(wifi.compareTo("nW")==0)
			nw="Not";
		else
			wifi="NULL";
		System.out.println("Laundry service needed or not(L OR nL)");
		String laundry=br.readLine();
		if(laundry.compareTo("L")==0)
			total=total+500;
		else if(laundry.compareTo("nL")==0)
			lf="out";
		else
			laundry="NULL";
		System.out.println("The total charge is Rs."+total+".\nThe services chosen are \n" +cot+" cot "+ac+" room \nCable connection "+nc+" enabled\nWi-Fi "+nw+" enabled \nWith"+lf+" laundry service");
		System.out.println("Do you want to proceed?(yes/no)");
		String ok=br.readLine();
		if(ok.compareTo("yes")==0)
		{
		
			for(int i=1;i<=25;i++)
			{
				if(room[i]==0)
				{
					System.out.println("Thank you for booking. Your room number is "+i);
					room[i]=1;
					break;
					
				}
			}
		}
		
		
	}

	

}
