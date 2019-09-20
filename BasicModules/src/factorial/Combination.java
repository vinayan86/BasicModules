package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination {

	public static void main(String[] args)throws IOException {
	
		int factorial=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number alphabets in your name");
		int numberOfAlphabets=Integer.parseInt(br.readLine());
		for(int i=numberOfAlphabets;i>0;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("The number of combination is "+ factorial);
	}

}
