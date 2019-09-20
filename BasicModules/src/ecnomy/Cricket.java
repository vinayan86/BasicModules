package ecnomy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cricket {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	float over,overall=0;
	int count=0;
		System.out.println("Enter the number of bowlers");
		int numberOfBowlers=Integer.parseInt(br.readLine());
		int runsConceded[]=new int[numberOfBowlers];
		System.out.println("Enter the runs conceded by the bowlers");
		for(int i=0;i<numberOfBowlers;i++)
		{
			runsConceded[i]=Integer.parseInt(br.readLine());
		}
		int numberOfBalls[]=new int[numberOfBowlers];
		System.out.println("Enter the number of balls for each bowler");
		for(int i=0;i<numberOfBowlers;i++)
		{
			numberOfBalls[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Economy of the bowlers is");
		for(int i=0;i<numberOfBowlers;i++)
		{
		over=numberOfBalls[i]/6;
		System.out.println(runsConceded[i]/over);
		if(runsConceded[i]/over<6)
		{
			count++;
		}
		overall=overall+runsConceded[i]/over;
		}
			
		System.out.println("The overall economy of the teanm is "+ overall/numberOfBowlers);
		System.out.println("The number of bowlers eligible are "+count);
	}

}
