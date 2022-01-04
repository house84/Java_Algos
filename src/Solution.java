import java.util.*;
public class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		int minimum = 1;
		boolean arr[] = new boolean[A.length+1];

		for(int i = 0; i < A.length; ++i){
			//System.out.print(arr[i] + " ");
			if(A[i] > 0 ){
				arr[A[i]] = true;
			}
		}

		int i;
		for(i = 1; i < arr.length; ++i){
			if(arr[i] == false){
				return i;
			}
		}
		return i;
	}
}
