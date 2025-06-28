package com.devManoj.main;

import java.util.Scanner;
import com.devManoj.db.DBOperation;
import com.devManoj.entity.Student;

public class MainApp
{	
	// Scanner class instance for user input
	private static Scanner sc;
	
	//static block for initializing Scanner instance
	static {
		sc = new Scanner(System.in);
	}
	
	//for getting the student entity
	//
	private static Student getStudent(){
		
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter marks");
		int marks = sc.nextInt();
		Student s = new Student();
		s.setId(id); 
		s.setName(name);
		s.setMarks(marks);
		
		return s;
	}
	
	// getting id from userinput 
	// and used for maniputation
	
	private static int getingId(){
		
		System.out.println("enter id");
		int id = sc.nextInt();
		return id;
	}
	
	// main method or can say entry point
	public static void main(String... mk)
	{
		DBOperation dbops = DBOperation.getDBOperation();
		int num = 4;
		System.out.println("\n1. add ");
		System.out.println("2. remove ");
		System.out.println("3. all view ");
		System.out.println("4. Exit \n");
		System.out.print("CHOOSE ANY OPTION : ");
		try{
		num = sc.nextInt();
		
		System.out.println();
		
		//form started here for operations
		switch(num)
		{
			case 1: dbops.addStudent(getStudent());break;
			
			case 2: dbops.removeStudent(getingId());break;
			
			case 3: dbops.allStudents();break;
			
			case 4: System.exit(0);
			
			default : System.out.println("Wrong selection " );
		}
		
		//recalling main method if user not selecting
		// option 4 for exiting the application
		
		main(mk);
		}catch(Exception e){
			System.out.println("\n\n-----------------------------------\n\n"
								+ "Thanks for using our product. bye!!"
							 + "\n\n-----------------------------------");
		}
	}
}