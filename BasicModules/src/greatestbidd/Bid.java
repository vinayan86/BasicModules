package greatestbidd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bid {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Enter the number of applications");
			int numberOfApplication=Integer.parseInt(br.readLine());
			int amount[]=new int[numberOfApplication];
			System.out.println("Enter the amount(in crores)");
			int highestBid=0;
			for(int i=0;i<numberOfApplication;i++)
			{
				amount[i]=Integer.parseInt(br.readLine());
				if(highestBid<amount[i])
				{
					highestBid=amount[i];
				
				}
			}
			System.out.println("The winning bid is "+ highestBid +" crores");

	}

}
