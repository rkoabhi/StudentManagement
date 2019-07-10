package com.studentmanagement;

import java.util.Scanner;

public class Admin {
	UserInput u = new UserInput();
	
	void doAction(){
		char s;
	do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.print("1 Add\n 2 View\n 3 Edit\n 4 Delete\n 5 Save and Exit : ");
		
		int i = sc.nextInt();
		switch(i){
			case 1: add();
			break;
			case 2 : view();
			break;
			case 3: edit();
		}
		System.out.print("Want to proceed further(y/n) : ");
		 s= sc.next().charAt(0);
	}while(s!='n');
	}
	
	public void add() {
		u.getUserInput();
	}
	
	public void view() {
		u.displayUserInput();
	}
	public void edit() {
		System.out.println("Enter Student id ");
		
	}
}
