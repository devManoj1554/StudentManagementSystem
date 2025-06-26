package com.devManoj.db;

import com.devManoj.entity.Student;
import java.util.List;
import java.util.ArrayList;


// this class is used for database operation
//here we are not using real database
// but using ArrayList to store and 
//manipulating the Student entity

public class DBOperation
{
	private static List<Student> students = new ArrayList<Student>();
	private static DBOperation dbops;
	private DBOperation(){}
	
	public static DBOperation getDBOperation(){
		if(dbops == null)
			dbops = new DBOperation();
		
		return dbops;
	}
	
	//method used for adding a student in list
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	// method is used for removing a student
	// if the student is exist otherwise
	// gives a user friendly massage
	
	public void removeStudent(int id){
		Student std = findStudentById(id);
		
		if(std == null)System.out.println("No student found for this id");
		else{students.remove(std);
		System.out.println("student removed successfully with id : " + id + "\n");}
	}
	
	// set list but not used here 
	public void setStudent(List<Student> students){
		this.students = students;
	}
	
	//useful for removing or updating a student 
	//as we can identify a student with the 
	// help of student id
	private Student findStudentById(int id){
		for(Student s : students){
			if(s.getId() == id) 
				return s;
		}
		return null;
	}
	
	//printing all student object 
	
	public void allStudents(){
		for(Student s : students){
			System.out.println(s);
		}
	}
}