package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Booking {
	public static int rid=0;

	public static void main(String[] args) throws IOException {
		
				
				}
				
			

			public void book() throws IOException
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int total=0;
				String nc=" ",nw=" ",lf=" ";
				System.out.println("Please choose the services required\nAC/non-AC(AC or nAC)");
				String ac=br.readLine();
				
				if(ac.compareTo("AC")==0)
				{
					total=total+1000;
					ac="AC";
				}
				else if(ac.compareTo("nAC")==0)
				{
					
					total=total+750;
					ac="NON-AC";
				}
				else
					ac="NULL";
				System.out.println("Cot(Single/Double)");
				String cot=br.readLine();
				if(cot.compareTo("Single")==0)
					total=total+0;
				else if(cot.compareTo("Double")==0)
					total=total+350;
				else
					cot="NULL";
				System.out.println("With cable connection/without cable connection(c OR nc)");
				String cable=br.readLine();
				if(cable.compareTo("c")==0)
					total=total+50;
				else if(cable.compareTo("nc")==0)
					nc="Not";
				else
					cable="NULL";
				System.out.println("Wi-Fi needed or not(w OR nW)");
				String wifi=br.readLine();
				if(wifi.compareTo("w")==0)
					total=total+200;
				else if(wifi.compareTo("nW")==0)
					nw="Not";
				else
					wifi="NULL";
				System.out.println("Laundry service needed or not(L OR nL)");
				String laundry=br.readLine();
				if(laundry.compareTo("L")==0)
					total=total+100;
				else if(laundry.compareTo("nL")==0)
					lf="out";
				else
					laundry="NULL";
				System.out.println("The total charge is Rs."+total+".\nThe services chosen are \n" +cot+" cot "+ac+" room \nCable connection "+nc+" enabled\nWi-Fi "+nw+" enabled \nWith"+lf+" laundry service");
				System.out.println("Do you want to proceed?(yes/no)");
				String ok=br.readLine();
				if(ok.compareTo("yes")==0)
				{
				
	System.out.println("Thank you for booking. Your room number is "+ ++rid);
							
					
				
			}

			
				
				
			}

	}


