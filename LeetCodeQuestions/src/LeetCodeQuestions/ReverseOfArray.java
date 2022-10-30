package LeetCodeQuestions;

import java.sql.Array;
import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		reverseArray(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void reverseArray(int[] arr,int start,int end) {
		
		if(start > end)  return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		reverseArray(arr, start+1, end-1);
	}
}
