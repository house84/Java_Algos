import java.util.Scanner;

public class MatrixInversions {

	MatrixInversions(){

		Scanner s = new Scanner(System.in);
		int T = Integer.parseInt(s.nextLine().trim());

		//For Each Testing Condition
		for(int x = 0; x < T; ++x){

			int N = Integer.parseInt(s.nextLine().trim());
			int[] M = new int[N*N];

			//Turn 2D matrix into Array
			for(int i = 0; i < N; ++i){

				String rows = s.nextLine().trim();
				String arr[];
				arr = rows.split(" ");
				for(int j = 0; j < N; ++j){
					//System.out.println(arr[j]);
					M[(i*N)+j] = Integer.parseInt(arr[j]);
				}
			}

			int count = 0;
			int len = M.length;

			//Count Inversions
			for(int i = 0; i < len-1; ++i){
				for(int j = i+1; j < len; ++j){
					// i/N = Rows    i%N = Columns
					if(M[i] > M[j] && i/N <= j/N && i%N <= j%N ){ ++count; }
				}
			}

			System.out.println(count);
		}
	}
}
