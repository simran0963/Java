/*WAJP to demonstrate the working of banking system. Instance variables: name, account number, amount. Methods: Deposit(), Withdraw(), DisplayBalance(). */

import java.io.*;
import java.util.*;

public class BankingDetails{
	String name;
	int accnum, amount=0;
	public void setDetails(){
		name="Simran Mehta";
		accnum=21022;
	};

	public void getDetails(){
		System.out.println("Name : "+name);
		System.out.println("Account Number : "+accnum);
		System.out.println("Amount : "+amount);
	}
	
	public void deposit(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount to deposit : ");
		amount=amount+sc.nextInt();
	};

	public void withdraw(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount to withdraw : ");
		int wth=sc.nextInt();
		if(amount>=wth){
			amount=amount-wth;
		}
		else{
			System.out.println("Insufficient Balance");
		}
	};

	public void displayBalance(){
		System.out.println("Your Balance is : "+amount);
	}

	public static void main(String args[]){
		BankingDetails obj=new BankingDetails();
		int ch;
		while(true){
			System.out.println("1. Deposit\t2. Withdraw\t3. Display Balance\t4. All Details\t5. Exit");
			Scanner sc=new Scanner(System.in);
			ch=sc.nextInt();
			switch(ch){
				case 1:
				obj.deposit();
				break;

				case 2:
				obj.withdraw();
				break;

				case 3:
				obj.displayBalance();
				break;

				case 4:
				obj.setDetails();
				obj.getDetails();
				break;
				
				case 5:
				System.exit(0);
			}
		}
	}
}