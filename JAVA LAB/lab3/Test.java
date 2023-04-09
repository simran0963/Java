
/* 
write a program in java to apply the following function on the string "Java"
1) try concatinating welcome and write down your observation
2. find the character at index i;
3. find the index of first a
4. compare Java to another string JAVA 
5. Compare the string Java to JAVA ignoring the case
6. Find the index of first a from the last
*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class Test{
	public static void main(String args[]){
		String str="Java";
		String str2="Welcome";
		str=str.concat(str2);
		System.out.println(str);

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(str.charAt(n));

		System.out.println(str.indexOf('a'));

		System.out.println(str.equals(str2));

		System.out.println(str.equalsIgnoreCase(str2));

		System.out.println(str.lastIndexOf('a'));
	}
}