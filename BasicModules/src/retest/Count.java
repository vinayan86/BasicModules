package retest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int numberOfStudents,count=0;
	
		System.out.println("Enter the number of students");
		numberOfStudents=Integer.parseInt(br.readLine());
		int marksOfStudents[]=new int[numberOfStudents];
		System.out.println("Enter the Marks of students");
		for(int i=0;i<numberOfStudents;i++)
		{
		
		marksOfStudents[i]=Integer.parseInt(br.readLine());
		if(marksOfStudents[i]<50)
		{
			count++;
		}
		}
		System.out.println("Number of students appearing for retest is "+count);
		

	}

}
