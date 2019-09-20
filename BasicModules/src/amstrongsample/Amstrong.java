package amstrongsample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Amstrong {

	public static void main(String[] args) throws IOException {
		
		int number,remainder,sum=0,temp,count=0,power;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number...");
		number=Integer.parseInt(br.readLine());
		temp=number;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		number=temp;
		while(number!=0)
		{
			remainder=number%10;
			
			power=(int)Math.pow(remainder, count);
			sum=sum+power;
			number=number/10;
			
		}
		if(temp==sum)
		{
			System.out.println("The given number is amstrong");
		}
		else
		{
			System.out.println("The given number is not amstrong");
		}

	}

}
