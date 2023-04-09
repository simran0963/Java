/* Wap to find the maximum, 2nd maximum, min and 2nd min from an array of integers without sorting.*/
import java.io.*;
import java.util.*;
class maxMin{
	public static void main(String args[]){
		int[] arr={23,45,12,56,78,9,34};
		int max=0,secmax=0, min=arr[0], secmin=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				secmax=max;
				max=arr[i];
			}
			else if(arr[i]>secmax){
				secmax=arr[i];
			}
		}

		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				secmin=min;
				min=arr[i];
			}

			else if(arr[i]<secmin){
				secmin=arr[i];
			}
		}
		System.out.println("Maximum : " + max);
		System.out.println("Second maximum : " + secmax);
		System.out.println("Minimum : " + min);
		System.out.println("Seconf minimum : " + secmin);
	} 
}