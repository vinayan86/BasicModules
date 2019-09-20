package digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitsOfCharacter {

	public static void main(String[] args)throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int s=0;
		System.out.println("Enter the Digit");
		int n=Integer.parseInt(br.readLine());
		while(n!=0)
		{
		if(n<20)
		{
		switch(n)
		{
		case 1:
		case 2:
		case 6:
		case 10:
			s=s+3;
			break;
		case 3:
		case 7:
		case 8:
			s=s+5;
			break;
		case 4:
		case 5:
		case 9:
			s=s+4;
			break;
		case 11:
		case 12:
			s=s+6;
			break;
		case 13:
		case 14:
		case 18:
		case 19:
			s=s+8;
			break;
		case 15:
		case 16:
			s=s+7;
			break;
		
		case 17:
			s=s+9;
			break;
			
		}
		}
		else if(n<=20&&n>=90)
		{
			int m;
		int k=(n/10)*10;
			switch(k)
			{
			case 20:
			case 30:
			case 80:
			case 90:
				s=s+6;
				break;
			case 40:
			case 50:
			case 60:
				s=s+5;
				break;
			case 70:
				s=s+7;
				break;
				
			}
		}
		n=n/10;
		}
		System.out.println("count"+s);
	}

}
