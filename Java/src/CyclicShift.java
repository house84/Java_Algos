import java.util.Scanner;

//HackerEarth Code Monk Problem Cyclic Shift
/*
Cyclic shift
A large binary number is represented by a string  of size  and comprises of  and . You must perform a cyclic shift on this string. The cyclic shift operation is defined as follows:

If the string  is , then after performing one cyclic shift, the string becomes .
You performed the shift infinite number of times and each time you recorded the value of the binary number represented by the string. The maximum binary number formed after performing (possibly ) the operation is . Your task is to determine the number of cyclic shifts that can be performed such that the value represented by the string  will be equal to  for the  time.

Input format

First line: A single integer  denoting the number of test cases
For each test case:
First line: Two space-separated integers  and
Second line:  denoting the string
Output format

For each test case, print a single line containing one integer that represents the number of cyclic shift operations performed such that the value represented by string  is equal to  for the  time.
 */


public class CyclicShift {

	int sigDigits(String arr){
		//Check for most significant digits
		int sig = 0;

		for(int i = 0; i < arr.length(); ++i){
			if(arr.charAt(i) == '1'){ ++sig; }
			else { break; }
		}
		return sig;
	}

	CyclicShift(){

		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine().trim());

		//For Each Testing Condition
		for(int x = 0; x < T; ++x){

			String[] inputArr = s.nextLine().trim().split(" ");
			int N = Integer.parseInt(inputArr[0]);
			int K = Integer.parseInt(inputArr[1]);

			String A = s.nextLine().trim();
			String B = A;
			int l = B.length();
			long testInt = 0;
			long shifts = 0;
			int sigMax = sigDigits(B);


			for(int i = 0; i < l; ++i){

				String test = A;
				if(A.charAt(i) == '1' && i > 0 && A.charAt(i-1)!= '1' ){
					test = A.substring(i, l) + A.substring(0,i);

					int sig = sigDigits(test);

					if(sig > sigMax) {
						sigMax = sig;
						B = test;
						shifts = i;
					}
					if(sig == sigMax){
						for(int j = sig; j < l; ++j){
							if(test.charAt(j) != B.charAt(j)){
								if(test.charAt(j) == '1'){
									sigMax = sig;
									B = test;
									shifts = i;
								}
								else { break; }
							}
						}
					}
				}
			}

			//Find Period for Input
			int[] pi = new int[l];
			for(int i = 1; i < l; ++i){
				int j = pi[i-1];
				while(j > 0 && B.charAt(i) != B.charAt(j)){ j = pi[j-1]; }
				if(B.charAt(i) == B.charAt(j)){ ++j; }
				pi[i] = j;
			}

			long period = l - pi[l-1];
			long cyclicShifts = (K-1) * period + (1*shifts);
			if(period == shifts) { System.out.println((K-1)*period); }
			else{ System.out.println(cyclicShifts + " Shifts: " + shifts + " Period: " + period); }

		}
	}
}
