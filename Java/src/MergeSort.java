import java.util.*;

public class MergeSort {


	String arrString[];
	Scanner s = new Scanner(System.in);

	MergeSort(){

		System.out.print("Enter Array: ");
		String line = s.nextLine();
		arrString = line.split(" ");
		int arr[];
		arr = new int[arrString.length];
		for(int i = 0; i < arrString.length; ++i){

			arr[i] = Integer.parseInt(arrString[i]);
		}

		printArr(arr);

		sort(arr, 0, arr.length-1);

		printArr(arr);
	}

	private void printArr(int[] arr){
		System.out.println();
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i]+" ");
		}
	}
	private void sort(int[] arr, int l, int r){
		if (l < r) {
			// Find the middle point
			int m =l+ (r-l)/2;

			// Sort first and second halves
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	private void merge(int[] arr, int l, int m, int r){

		//Get Sizes of Sub Array
		int n1 = m-l+1;
		int n2 = r-m;

		//Create Temp Array
		int L[] = new int[n1];
		int R[] = new int[n2];

		//Copy to Temp Arrays
		for(int i = 0; i < n1; ++i){ L[i] = arr[l+i]; }
		for(int i = 0; i < n2; ++i){ R[i] = arr[m+1+i]; }

		//Merge Temp Array
		int i=0, j=0;

		int k = l;
		while(i < n1 && j < n2){

			if(L[i] <= R[j]){
				arr[k] = L[i];
				++i;
			}

			else{
				arr[k] = R[j];
				++j;
			}
			++k;
		}

		//Copy remaining elements of L[] and R[] to arr[]
		while(i < n1){
			arr[k] = L[i];
			++i;
			++k;
		}

		while(j < n2 ){
			arr[k] = R[j];
			++j;
			++k;
		}
	}
}
