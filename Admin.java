package StudentManagement;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Admin {
	UserInput u = new UserInput();
	Student s = null;
	ConcurrentHashMap<Integer, Student> chm = new ConcurrentHashMap<>();
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
		chm.put(s.getId(), s);
	}
	
	public void view() {
		Set<Integer> id = chm.keySet();
		Iterator<Integer> itr = id.iterator();
		while(itr.hasNext()) {
			Student s =chm.get(itr.next());
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMark1()+" "+s.getMark2());
		}
	}
	public void edit() {
		System.out.println("Enter Student id ");
		
	}
}
