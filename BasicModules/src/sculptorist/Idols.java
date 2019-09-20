package sculptorist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.ws.FaultAction;

public class Idols {

	public static void main(String[] args)throws IOException {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the kgs of gold");
		int gold=Integer.parseInt(br.readLine());
		int s=gold/5;
		 gold=gold+s/5+s;
		System.out.println(gold);
		

	}
	

}
