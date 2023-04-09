import java.io.*;
import java.util.*;

public class Employee{
	String empname;
	int empcode;
	double basicpay;
	Employee(){
		empname=null;
		empcode=0;
		basicpay=0.0;
	}
	Employee(String n, int p, double q){
		empname=n;
		empcode=p;
		basicpay=q;
	}
	double salarycal(){
		double HRA=0.3*basicpay;
		double DA=0.4*basicpay;
		double salary = basicpay + HRA + DA;
		System.out.println("Salary = "+salary);
		double allow;
		if(empcode<=15 && salary<=15000){
			allow=0.2*salary;
			if(allow>2500){
				allow=2500;
			}
			salary+=allow;
			System.out.println("Salary = "+salary);
		}
		else{
			salary+=1000;
			System.out.println("Salary = "+salary);
		}
		return salary;
	}
	public static void main(String args[]){
		Employee ob=new Employee("Simran",12,25000.0);
		double fsal=ob.salarycal();
		System.out.println("Salary = "+fsal);
	}
	
}