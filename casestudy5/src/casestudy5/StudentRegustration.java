package casestudy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Student
{
	 String name;
	 String address;
	 String contactNumber;
     String email;
	 String proofType;
	 String proofId;	
}
public class StudentRegustration {

public static int n=0;
public static Student st[]=new	Student[100];

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String ch;
		int i=1;
		

		do
			{
		st[i]=new Student();
			System.out.println("Enter Your Name...");
		    st[i].name = br.readLine();
			System.out.println("Enter Your Address...");
			st[i].address=br.readLine();
			System.out.println("Enter Your Contact Number...");
			st[i].contactNumber=br.readLine();
			System.out.println("Enter Your Email...");
			st[i].email=br.readLine();
			System.out.println("Enter Your Proof Type...");
			st[i].proofType=br.readLine();
			System.out.println("Enter Your Proof ID...");
			st[i].proofId=br.readLine();
			System.out.println("Thank You for Registering...Your Rgister Id ="+ ++n);
			
	
		i++;

		
			System.out.println("Do you want to continue registration (y/n)?");
			 ch=br.readLine();
			}while(ch.equalsIgnoreCase("y"));
		
		
display();
	}

	

	private static void display() {
		System.out.println("Customers list\nThe registered customers are\nCustomer ID  Customer name");
		

		
		for(int i=1;i<=n;i++)
		{
		System.out.println("\t"+i+"       "+st[i].name);

		}
		System.out.println("Thank You");
	}

	}

