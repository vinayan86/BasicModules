package sumofpositivenumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbers {
	static void sumOfNumber(int number) {
		int sum=0;
		for(int i=1;i<=number;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum is "+sum);
	  }

	public static void main(String[] args)throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter a number");
		int number=Integer.parseInt(br.readLine());
		
		if(number<0)
		{
			System.out.println("Enter a number");
			number=Integer.parseInt(br.readLine());
			sumOfNumber(number);
			
		}
		else
		{
			sumOfNumber(number);
		}
	}

}
