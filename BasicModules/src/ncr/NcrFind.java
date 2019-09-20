package ncr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NcrFind {
	static long factorial(int n) {
		long fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
	    return fact;
	  }

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the value of n");
		int number=Integer.parseInt(br.readLine());
		System.out.println("Enter the value of r");
		int r=Integer.parseInt(br.readLine());
		long nfact=factorial(number);
		long nrfact=factorial(number-r);
		long rfact=factorial(r);
		long ncr=nfact/(nrfact*rfact);
		System.out.println("The NCR factor for given values is "+ncr);

	}

}
