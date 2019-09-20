package boardexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfStudents,sum=0,averageOfMarks;
	
		System.out.println("Enter the number of students");
		numberOfStudents=Integer.parseInt(br.readLine());
		int marksOfStudents[]=new int[numberOfStudents];
		System.out.println("Enter the Marks of students");
		for(int i=0;i<numberOfStudents;i++)
		{
		marksOfStudents[i]=Integer.parseInt(br.readLine());
		sum=sum+marksOfStudents[i];
		}
	
		averageOfMarks=sum/numberOfStudents;
		System.out.println("The average is "+averageOfMarks);
	

	}

}
