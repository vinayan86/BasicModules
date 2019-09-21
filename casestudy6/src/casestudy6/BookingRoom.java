package casestudy6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;




class room
{
	int rno=0;
	Date sdate;
}
public class BookingRoom {

//public static String room[][]=new String[25][25];
public static room rm[]=new	room[25];
static String name;
static String address;
static String contactNumber;
static String email;
static String proofType;
static String proofId;
public static int regid=0;
public static int k=1;
	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int choice;
		
		
		do
		{
		System.out.println("Enter your choice\n1:Register\n2:View Details\n3:Exit");
		choice=Integer.parseInt(br.readLine());
		
		
		switch(choice)
		{
		case 1:
		    registration();
		    break;
		case 2:
			viewDetails();
			break;
		case 3:
			System.exit(0);
			break;
		}
		}while(choice!=3);
	}

	private static void viewDetails() {
		for(int i=1;i<k;i++)
		{
			if(rm[i].rno==0)
			{
				break;
			}
			else
			{
				System.out.println(rm[i].rno+"\t"+rm[i].sdate);
			}
		}
		
	}

	private static void registration() throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name...");
		name=br.readLine();
		System.out.println("Enter Your Address...");
		address=br.readLine();
		System.out.println("Enter Your Contact Number...");
		contactNumber=br.readLine();
		System.out.println("Enter Your Email...");
		email=br.readLine();
		System.out.println("Enter Your Proof Type...");
		proofType=br.readLine();
		System.out.println("Enter Your Proof ID...");
		proofId=br.readLine();
		System.out.println("Thank You for Registering...Your Rgister Id ="+ ++regid);
		
		System.out.println("Do you want to book Room (y/n)?");
		String ch=br.readLine();
		if(ch.equalsIgnoreCase("y"));
		{
		 book();
		}
		
			System.out.println("Thank You..");
		
		
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
		if(ok.equalsIgnoreCase("yes"))
		{
			
			rm[k]=new room();
			for(int i=1;i<=25;i++)
			{
				
				if(rm[i].rno==0)
				{
					
					rm[i].rno=i;
					
				
					rm[i].sdate=new Date();
					break;
					
				
				}
			}
			k++;
			System.out.println("Do you want to Registration?(yes/no)");
			String newreg=br.readLine();
			if(newreg.equalsIgnoreCase("yes"))
			{
			registration();
			}
		}
		
		
	}

}
