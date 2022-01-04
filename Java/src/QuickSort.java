import java.util.*;

public class QuickSort {
	int count = 0;

	QuickSort(){

		int[] arr = {4,3,1,4};
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i]+ " ");
		}
		quickSort(arr, 0, arr.length-1);
		System.out.println();
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i]+ " ");
		}

		System.out.println("Count: " + count);

	}

	void swap(int[] arr,int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	int partition(int[] arr, int low, int high){
		//Select Highest Element for Pivot
		int pivot = arr[high];

		//Select Random Element for Pivot
//		Random rand = new Random();
//		int pivot = rand.nextInt(high-low)+low;

		int i = (low - 1);

		for( int j = low; j < high; ++j){
			//if Current smaller than pivot
			if(arr[j] < pivot){
				++i;
				swap(arr, i, j);
			}
		}

		swap(arr, i+1, high);
		return (i +1);
	}

	void quickSort(int[] arr, int low, int high){
		if(low < high){
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
}
