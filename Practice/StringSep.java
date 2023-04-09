import java.io.*;
import java. util.*;

public class StringSep{
	public static void main(String args[]){
		String s = "w3resources.com";
		StringBuilder str = new StringBuilder();
		int size = s.length();
		/*for(int i : s.toCharArray()){
			str.append(i).append(" ");
		}*/
		System.out.println("New String is : " + str.toString().trim());
	}

}