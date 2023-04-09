/* Create a class student having following instance variables and methods id, name, branch, university methods: setdetails and getdetails. 
The setdetails method sets the value of id, name, branch and university, getdetails method shows the value of each field.*/

import java.io.*;
import java.util.*;
public class StudentDetails{
	String name, branch, uni;
	int id;
	public static void setDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.print("ID: ");
		id=sc.nextInt();
		System.out.print("Name: ");
		name=sc.next();
		System.out.print("Branch: ");
		branch=sc.next();
		System.out.print("University: ");
		uni=sc.next();
		System.out.println();
	};

	public void getDetails(){
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Branch : "+branch);
		System.out.println("University : "+uni);
	};

	public static void main(String args[]){
		StudentDetails obj=new StudentDetails();
		obj.setDetails();
		obj.getDetails();
	}
}