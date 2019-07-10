package org.veena.miniproject;

import java.util.concurrent.ConcurrentHashMap;

public interface StudentManagement {

		void addStudent(ConcurrentHashMap<Integer,Student> conHashMap);
		
		void viewStudent(ConcurrentHashMap<Integer,Student> conHashMap);
		
		void deleteStudent(ConcurrentHashMap<Integer,Student> conHashMap);
		
		void editStudent(ConcurrentHashMap<Integer,Student> conHashMap);
		
		void saveAndExit(ConcurrentHashMap<Integer,Student> conHashMap);
		
}
