package divisors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectDivisors {

	public static void main(String[] args) throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a number");
		int number=Integer.parseInt(br.readLine());
		int sum=0;
		System.out.print("The divisors of the number are");
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.print(" "+ i);
				sum=sum+i;
			}
		}
		
		System.out.println("\nThe sum of the divisors are "+ sum);
		if(sum==number)
		{
			System.out.println("It is a perfect number ");
		}
		else
		{
			System.out.println("It is not a perfect number ");
		}
	}

}
