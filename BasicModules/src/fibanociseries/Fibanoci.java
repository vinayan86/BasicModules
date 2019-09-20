package fibanociseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibanoci {

	public static void main(String[] args) throws IOException {


	int n1=0,n2=1,n3;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int number=Integer.parseInt(br.readLine());
		System.out.print("The fibonacci series is "+n1 +" "+ n2);
		for(int i=0;i<=number;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
