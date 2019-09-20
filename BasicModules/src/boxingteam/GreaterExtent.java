package boxingteam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterExtent {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of players");
		int numberOfPlayers=Integer.parseInt(br.readLine());
		if(numberOfPlayers>0)
		{
		int amount[]=new int[numberOfPlayers];
		System.out.println("Enter the number of fouls made by each player");
		int fouls=0,position=0;
		for(int i=0;i<numberOfPlayers;i++)
		{
			amount[i]=Integer.parseInt(br.readLine());
			if(i==0)
			{
				fouls=amount[i];
				position=1;
		     }
			else if(fouls>amount[i])
			{
				fouls=amount[i];
				position=i+1;
			
			}
		}
		System.out.println("The eligible player is player no: "+ position + " ( "+fouls+" fouls)");
		}
		else
			System.out.println("Please recheck entered players count correct!!!!");

	}

}
