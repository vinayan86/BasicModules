package vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleCharge {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of vehicles");
		int numberOfVehicles=Integer.parseInt(br.readLine());
		int amount[]=new int[numberOfVehicles];
		System.out.println("Enter the amount(in crores)");
		int lightVehicle=0,heavyVehicle=0;
		for(int i=0;i<numberOfVehicles;i++)
		{
			amount[i]=Integer.parseInt(br.readLine());
			if(amount[i]<50&&amount[i]>0)
			{
				lightVehicle++;
			}
			if(amount[i]>50)
			{
				heavyVehicle++;
			}
			
			
		}
System.out.println("Number of heavy vehicles "+heavyVehicle+" and the number of light weight vehicles is "+lightVehicle);
	}

}
