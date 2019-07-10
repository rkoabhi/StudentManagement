package com.studentmanagement;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {

	StudentDetails s = new StudentDetails();
	void getUserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the student id : ");
		s.setId(sc.nextInt());
		System.out.print("Enter Student name : ");
		s.setName(sc.next());
		float marks[]= new float[s.getArraySize()];
		for(int i=0;i< s.getArraySize();i++) {
			System.out.print("Enter Student marks in subject : "+(i+1)+" ");
			marks[i]=sc.nextFloat();
		}
		s.setMarks1(marks);
	}
	void displayUserInput() {
		System.out.println("Id : "+s.getId());
		System.out.println("Name : "+s.getName());
		System.out.println("Marks : "+Arrays.toString(s.getMarks1()));
		
	}
}
