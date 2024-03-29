package StudentManagement;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Admin implements StudentManagement {
	UserInput u = new UserInput();
	Student s = null;
	MemoryManager mm = null;
	FileManager fm = null;
	ConcurrentHashMap<Integer, Student> chm = null;
	Admin(){
		mm = new MemoryManager();
		fm = new FileManager();
	}
	
	@SuppressWarnings("resource")
	void doAction(){
		if(fm.loadConfigurationFile() == 0)
			chm = new ConcurrentHashMap<>();
		else
			chm = fm.deserializeStudent();
		char s;
	do{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		System.out.print("1 Add\n 2 View\n 3 Edit\n 4 Delete\n 5 Save and Exit : ");
		
		int i = sc.nextInt();
		switch(i){
			case 1: addStudent();
			break;
			case 2 : viewStudent();
			break;
			case 3: editStudent();
			break;
			case 4: deleteStudent();
			break;
			case 5: saveAndExit();
			break;
			default:
				System.out.println("WRONGLY ENTERED...");

		}
		System.out.print("Want to proceed further(y/n) : ");
		 s= sc.next().charAt(0);
		
	}while(s!='n' || s!= 'N');
	}
	
	public void saveAndExit() {
		fm.serializeStudent(chm);
		System.exit(0);
		
	}

	public void deleteStudent() {
		System.out.println("Enter id");
		Scanner sc = new Scanner(System.in);
		//u.getInputId(s);
		int id= sc.nextInt();
		if(Validate.isPresent(id, chm))
			 chm.remove(id);
		viewStudent();
		
	}

	public void addStudent() {
		s = u.getUserInput();
		mm.add(s, chm);
//		chm.put(s.getId(), s);
	}
	
	public void viewStudent() {
		/*Set<Integer> id = chm.keySet();
		Iterator<Integer> itr = id.iterator();
		while(itr.hasNext()) {
			Student s =chm.get(itr.next());
			System.out.println(s.getId()+" "+s.getName()+" "+s.getMark1()+" "+s.getMark2());
		}*/
		mm.view(chm);
	}
	public void editStudent() {
		System.out.println("Enter Student id ");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		if(Validate.isPresent(id, chm)) {
			String name= sc.nextLine();
			mm.edit(id, name, chm);
		}		
	}

}
