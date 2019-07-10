package StudentManagement;

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

}

@SuppressWarnings("serial")
class InvalidInputException extends Exception{
	InvalidInputException(String emsg){
		super(emsg);		
	}
}
