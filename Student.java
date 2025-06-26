package com.devManoj.entity;
/*
 *	 This is the Student entity class used to model student data in the application.
 *	 
 *	 It contains fields and methods for storing and manipulating student details.
 *    
 *   In this console-based program, Student objects are stored and managed using an ArrayList,
 *     
 *	 simulating basic database operations like add, update, delete, and search.
 *	 
*/
public class Student implements java.io.Serializable
{
	// data members
	private int id; 
	private String name; 
	private int marks;
	
	
	// getters and setters 
	
	public int getId(){
		return id;
		}
	public void setId(int id){
		this.id = id;
		}
	
	public int getMarks(){
		return marks;
		}
	public void setMarks(int marks){
		this.marks = marks;
		}
	
	public String getName(){
		return name;
		}
	public void setName(String name){
		this.name = name;
		}
	
	public String toString(){
		return "Student ->[ id : "+id + ", Name : " +name+ ", Marks : " +marks +"]";
	}
	
}