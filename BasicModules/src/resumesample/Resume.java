package resumesample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Resume {

	public static void main(String[] args) throws IOException {
		String name,degree,branch,contactNumber;
		
		int age;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		System.out.println("Enter Your Name...");
		name=br.readLine();
		System.out.println("Enter Your Age...");
		age=Integer.parseInt(br.readLine()); 
		System.out.println("Enter Your Degree...");
		degree=br.readLine();
		System.out.println("Enter Your Branch...");
		branch=br.readLine();
		System.out.println("Enter Your Contact Number...");
		contactNumber=br.readLine();
		System.out.println("Name   : "+ name);
		System.out.println("Age    : "+ age);
		System.out.println("Degree : "+ degree);
		System.out.println("Branch : "+ branch);
		System.out.println("Number : "+ contactNumber);

		


	}
	

}
