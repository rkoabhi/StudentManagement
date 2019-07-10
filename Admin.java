package StudentManagement;

import java.util.Scanner;

public class Admin {
	UserInput u = new UserInput();
	Student s = null;
	@SuppressWarnings("resource")
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
			break;
			case 4: delete();
			break;
			case 5: save_and_exit();
			break;
			default:
				System.out.println("WRONGLY ENTERED...");

		}
		System.out.print("Want to proceed further(y/n) : ");
		 s= sc.next().charAt(0);
	}while(s!='n');
	}
	
	private void save_and_exit() {
		// TODO Auto-generated method stub
		
	}

	private void delete() {
		// TODO Auto-generated method stub
		
	}

	public void add() {
		s = u.getUserInput();
	}
	
	public void view() {
		u.displayUserInput(s);
	}
	public void edit() {
		System.out.println("Enter Student id ");
		
	}
}
