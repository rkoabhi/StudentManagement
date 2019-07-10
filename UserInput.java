package StudentManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
	Scanner sc = null;
	public void getInputId(Student s) {
		sc = new Scanner(System.in);
		try {
			System.out.print("Enter the student id : ");
			s.setId(sc.nextInt());
		}catch(InputMismatchException e) {
			System.out.println("Enter a valid input");
			getInputId(s);
		}
	}
	public void getInputName(Student s) {
		sc = new Scanner(System.in);
		try {
			System.out.print("Enter Student name : ");
			s.setName(sc.next());
			Validate.validateName(s.getName());
		}
		catch (InvalidInputException e) {
			System.out.println("Enter a valid input");
			getInputName(s);
		}
	}
	void getInputMark1(Student s) {
		sc = new Scanner(System.in);
		try {
			System.out.print("Enter Student marks of subject 1 ");
			s.setMark1(sc.nextFloat());
			Validate.validateMark(s.getMark1());
		}
		catch (InvalidInputException e) {
			System.out.println("Enter a valid input");
			getInputMark1(s);
		}catch(InputMismatchException e) {
			System.out.println("Enter a valid input");
			getInputMark1(s);
		}
	}
	
	void getInputMark2(Student s) {
		sc = new Scanner(System.in);
		try {
			System.out.print("Enter Student marks of subject 2 ");
			s.setMark2(sc.nextFloat());
			Validate.validateMark(s.getMark2());
		}
		catch (InvalidInputException e) {
			System.out.println("Enter a valid input");
			getInputMark2(s);
		}catch(InputMismatchException e) {
			System.out.println("Enter a valid input");
			getInputMark2(s);
		}
	}

	public Student getUserInput() {
		Student s = new Student();
		getInputId(s);
		getInputName(s);
		getInputMark1(s);
		getInputMark2(s);
		return s;
	}
	void displayUserInput(Student s) {
		System.out.println("Id : "+s.getId());
		System.out.println("Name : "+s.getName());
		System.out.println("Mark1 : "+s.getMark1());
		System.out.println("Mark2 : "+s.getMark2());
		
	}
}
