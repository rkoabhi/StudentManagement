package StudentManagement;

import java.util.concurrent.ConcurrentHashMap;

public class Validate {
	
	public static void validateName(String name) throws InvalidInputException {
		for(int i=0;i<name.length(); i++) {
			if ((Character.isLetter(name.charAt(i)) == false)) {
				throw new InvalidInputException("Invalid input");
			}
		}
	}
	
	public static void validateMark(float marks) throws InvalidInputException {
			if(marks>100.0)
				throw new InvalidInputException("Invalid input");
	}
	
	public static boolean isPresent(int id, ConcurrentHashMap<Integer, Student> chm) {
		if(chm.containsKey(id))
			return true;
		else
			return false;
	}
	
}
@SuppressWarnings("serial")
class InvalidInputException extends Exception{
	InvalidInputException(String emsg){
		super(emsg);		
	}
}

