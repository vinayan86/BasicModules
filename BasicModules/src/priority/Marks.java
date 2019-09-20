package priority;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marks {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfStudents;
	
		System.out.println("Enter the number of students");
		numberOfStudents=Integer.parseInt(br.readLine());
		int marksOfStudents[]=new int[numberOfStudents];
		System.out.println("Enter the Marks of students");
		for(int i=0;i<numberOfStudents;i++)
		{
		marksOfStudents[i]=Integer.parseInt(br.readLine());
		}
	
		for(int i=0;i<numberOfStudents;i++)
		{
			for(int j=i+1;j<numberOfStudents;j++)
			{
			if(marksOfStudents[i]<marksOfStudents[j])
			{
				int temp=marksOfStudents[i];
				marksOfStudents[i]=marksOfStudents[j];
				marksOfStudents[j]=temp;
				
			}
	
		}
		
	}
		System.out.println("The priority of marks is");
		for(int i=0;i<numberOfStudents;i++)
		{
			System.out.println(marksOfStudents[i]);
		}

	}

}
