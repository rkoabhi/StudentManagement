package StudentManagement;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryManager extends DataStoreManager{

public void add(Student student ,ConcurrentHashMap<Integer,Student> cHashMap){
		
		cHashMap.put(student.getId(),student);	
	}
	
public void delete(Integer studentID ,ConcurrentHashMap<Integer,Student> cHashMap){
	if(cHashMap.isEmpty()) {
		System.out.println("This operation is not permitted.Student record is Empty!!!");
		return;
	}
	
	cHashMap.remove(studentID);
	
}
public void edit(Integer studentId ,String name, ConcurrentHashMap<Integer,Student> cHashMap){
	if(cHashMap.isEmpty()) {
		System.out.println("This operation is not permitted.Student record is Empty!!!");
		return;}
	
		Student student = cHashMap.get(studentId);
		student.setName(name);
		cHashMap.put(studentId, student);	
		
}

public void view(ConcurrentHashMap<Integer,Student> cHashMap) {
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

