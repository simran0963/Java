import java.io.*;
import java. util.*;

public class Shape{
	void area(int s){
		double ara=s*s;
		System.out.println("Area of square: "+ara);
	}
	void area(int a, int b){
		double ara=a*b;
		System.out.println("Area of rectangle: "+ara);
	}
	void area(double s){
		double ara=3.14*s*s;
		System.out.println("Area of circle: "+ara);
	}
	public static void main(String args[]){
		Shape ob = new Shape();
		ob.area(2);
		ob.area(3,4);
		ob.area(7.0);
	}
}