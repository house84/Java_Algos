import java.util.*;
//Hacker Earth Code Monk
/*
Minimum AND xor OR
Given an array A of N integers. Find out the minimum value of the following expression for all valid i, j where
(Ai AND Aj) XOR (Ai OR Aj) where i != j

Input format

First line: A single integer T denoting the number of test cases
For each test case:
First line contains a single integer N, denoting the size of the array.
Second line contains N space separated integers A1, A2, A3,...,An
Output format

For each test case, print a single line containing one integer that represents the minimum value of the given expression
 */


public class MinimumAndOr {

	//int minimum;

	int insertSorted(int arr[], int n, int key, int N){

		if (n > N) { return n; }

		if (n == 1) {
			arr[0] = key;
			return n + 1;
		}
		if( n == 2){

			if(arr[0] > key){
				arr[1] = arr[0];
				arr[0] = key;
			} else { arr[1] = key; }

			return n + 1;
		}

		int i;
		for (i = n-2; (i >= 0 && arr[i] > key); i--){
			arr[i + 1] = arr[i];
		}

		arr[i + 1] = key;

		if( i >= 0 && arr[i] == key) {
			return -n;
		}

		arr[N] = Math.min(arr[N], arr[i]^key);

		return (n + 1);
	}

	MinimumAndOr(){

		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine().trim());

		//Repeat Test Cases
		for(int t = 0; t < T; ++t){

			int N = Integer.parseInt(s.next().trim());
			int[] A = new int[N+1];
			A[N] = Integer.MAX_VALUE;
			int n = 1;
			boolean flag = false;

			for(int i = 0; i < N-1; ++i) {
				if( !flag ) {

					n = insertSorted(A, n, s.nextInt(), N);

					if (n < 0) {
						A[N] = 0;
						n *= -1;
						flag = true;
					}

				}
				else { s.nextInt(); }
			}

			for(int i = 0; i < n; ++i){
				System.out.print(A[i] + " ");
			}
			int minimum = A[N];

			System.out.println(minimum);
		}
	}
}
