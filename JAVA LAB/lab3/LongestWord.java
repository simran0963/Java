/* develop a program in java to find out the longest wordi n a string
eg "Java is a programming language"
	output> 6
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class LongestWord{
	public static void main(String args[]){
		String str="Java is a programming language";
		int cnt=0, max=0;
		int n=str.length();
		for(int i=0;i<n;i++){
			if(str.charAt(i)!=' '){
				if(cnt>max){
					max=cnt;
				}
				cnt=0;
			}
			cnt++;
		}
		System.out.println("Longest word is of : "+max+" length");
	}	
}