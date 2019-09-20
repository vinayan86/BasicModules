package drill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Height {

	public static void main(String[] args) throws IOException {
		
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfStudents;
	
		System.out.println("Enter the number of students");
		numberOfStudents=Integer.parseInt(br.readLine());
		float heightOfStudents[]=new float[numberOfStudents];
		System.out.println("Enter the heights of students");
		for(int i=0;i<numberOfStudents;i++)
		{
		heightOfStudents[i]=Float.parseFloat(br.readLine());
		}
	
		for(int i=0;i<numberOfStudents;i++)
		{
			for(int j=i+1;j<numberOfStudents;j++)
			{
			if(heightOfStudents[i]>heightOfStudents[j])
			{
				Float temp=heightOfStudents[i];
				heightOfStudents[i]=heightOfStudents[j];
				heightOfStudents[j]=temp;
				
			}
	
		}
		
	}
		System.out.println("The heights in order are");
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.println(heightOfStudents[i]);
		}
		}

}
