package com.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	
	public static List<Student> getStudents(){
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		
		// add sample data
		students.add(new Student("Mary", "Public", "mary@code.com"));
		students.add(new Student("Anil", "Rao", "anil@code.com"));
		students.add(new Student("John", "Doe", "mary@code.com"));
		students.add(new Student("Maine", "Jeore", "maine@code.com"));
		students.add(new Student("Rose", "Preto", "rose@code.com"));
		
		
		// return the list
		return students;
		
		
		
	}
	
	
}
