package newjavaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeadClass {
	
	
		public static void main(String[] args) throws IOException
	
	{
			String name;
			String address;
			String contactNumber;
			String email;
			String proofType;
			String proofId;
	
			
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
		Customer customer =new Customer(name,address,contactNumber,email,proofType,proofId);
		customer.register(name, address, contactNumber, email, proofType, proofId);
	
		
	}
	
	

}
