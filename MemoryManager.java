import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryManager {

void add(Student student ,ConcurrentHashMap<Integer,Student> cHashMap){
		
		cHashMap.put(student.id,student);	
	}
	
void delete(Integer studentID ,ConcurrentHashMap<Integer,Student> cHashMap){
	if(cHashMap.isEmpty()) {
		System.out.println("This operation is not permitted.Student record is Empty!!!");
		return;
	}
	
	cHashMap.remove(studentID);
	
}
void edit(Integer studentId ,String name, ConcurrentHashMap<Integer,Student> cHashMap){
	if(cHashMap.isEmpty()) {
		System.out.println("This operation is not permitted.Student record is Empty!!!");
		return;}
	
		Student student = cHashMap.get(studentId);
		student.name = name;
		cHashMap.put(studentId, student);	
		
}

void view(ConcurrentHashMap<Integer,Student> cHashMap) {
		if(cHashMap.isEmpty()) {
			System.out.println("This operation is not permitted.Student record is Empty!!!");
			return;
		}

		for(Map.Entry<Integer,Student>  c	: cHashMap.entrySet())
		{
			
			System.out.println((Student)c.getValue());
		}	
		}
}

