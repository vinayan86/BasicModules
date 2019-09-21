package casestudy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailUpdation {

	
		public static int regid=0;
		public static void main(String[] args) throws IOException {
			
			String name;
			String address;
			String contactNumber;
			String email;
			String proofType;
			String proofId;

			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		String ch;
		do
		{
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
		
		System.out.println("Do you want to continue registration (y/n)?");
		 ch=br.readLine();
		}while(ch.equalsIgnoreCase("y"));
		
			
			System.out.println("Do you want to update the email id?(yes/no)");
			String emailUp=br.readLine();
			if(emailUp.compareTo("yes")==0)
			{
				System.out.println("Update Email:");
				System.out.println("Enter Your Email...");
				email=br.readLine();
			}
		
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("Number : "+contactNumber);
		System.out.println("Email : "+email);
		System.out.println("Proof Type : "+proofType);
		System.out.println("Proof ID : "+proofId);
		

	}

}
