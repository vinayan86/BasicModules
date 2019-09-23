package casestudy7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Regisstration {
	static String name;
	static String address;
	static String contactNumber;
	static String email;
	static String proofType;
	static String proofId;
	public static int regid=0;
	public static int k=1;

	public static void main(String[] args) {
		Booking b=new Booking();

	}
	static String register() throws IOException {
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
		return ch;
		
			
		
		
	}

}
