/* Develop a program to design a 2d array and insert elements into the array. Traverse the array and find the coordinates of a key 'k'*/

import java.util.*;
import java.io.*;

class findK{
	public static int[] findCoord(int[][] arr,int key){
	int[] ans={-1,-1};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==key){
					ans[0]=i;
					ans[1]=j;
					break;
				}
			}
		}
		return ans;
	}
	public static void main(String args[]){
		int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
		int[] ans={-1,-1};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		ans=findCoord(arr, key);
		System.out.println("Co-ordinates are : "+ans[0] +" "+ ans[1]);
	}

}