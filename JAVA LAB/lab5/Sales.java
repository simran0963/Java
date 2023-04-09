import java.io.*;
import java.util.*;

class Product{
	String name;
	int code;
	double amount;
	Product(String n, int c, double p){
		name=n;
		code=c;
		amount=p;
	}
	void show(){
		System.out.println("Name: "+name);
		System.out.println("Code: "+code);
		System.out.println("Amount: "+amount);
	}
}

public class Sales extends Product{
	int day;
	double tax;
	double totamt;
	Sales(String n, int c, double p, int d){
		super(n,c,p);
		day=d;
		tax=0.0;
		totamt=0.0;
	}
	void compute(){
		tax=amount*0.124;
		double fine=0.0;
		if(day>30){
			fine = 0.025*amount;
		}
		totamt=amount+tax+fine;
	}
	void show(){
		super.show();
		System.out.println("Total amount:"+totamt);
	}
	public static void main(String args[]){
		Sales ob = new Sales("Simran",12,25000,31);
		ob.compute();
		ob.show();
	}
}