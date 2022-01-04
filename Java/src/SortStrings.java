import java.util.*;

public class SortStrings {

	Scanner s = new Scanner(System.in);

	SortStrings(){

		int size = Integer.parseInt(s.nextLine());

		String[] arr = new String[size];
		int[] niceness = new int[size];

		for(int i = 0; i < size; ++i){

			arr[i] = s.nextLine();
			int x = i;

			for(int j = i-1; j >= 0; --j){
				while(arr[x].compareTo(arr[j]) <= 0){
					String temp = arr[x];
					arr[x] = arr[j];
					arr[j] = temp;
					--x;
					--j;
					if(j == -1){ break; }
				}
			}
			niceness[i] = x;
		}
		for(int i = 0; i < niceness.length; ++i){ System.out.print(arr[i]+ " ");}
		System.out.println();

		for(int i = 0; i < niceness.length; ++i){ System.out.println(niceness[i]); }
	}
}
