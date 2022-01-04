import java.util.*;

public class HackerEarth {

	int T, N, K, idx;
	String arrFormat[];

	HackerEarth(){

		//Get Input

		Scanner s = new Scanner(System.in);
		T = Integer.parseInt(s.nextLine());
		if(T>20 || T<1){ System.exit(-1);}
		//System.out.println("T = " + T);

		//Repeat for T test Cases
		for(int i = 0; i < T; ++i){

			String line = s.nextLine();
			arrFormat = line.split(" ");
			if(arrFormat.length != 2 ){ System.exit(-1); }

			//System.out.println("Line = " + Arrays.toString(arrFormat));

			N = Integer.parseInt(arrFormat[0]);
			if(N<1 || N > 100000){ System.exit(-1); }
			K = Integer.parseInt(arrFormat[1]);
			if(K<0 || K > 1000000){ System.exit(-1); }

			String array = s.nextLine();
			array = array.trim();

			if(K==0 || K%N == 0){
				System.out.println(array);
			}
			else{
				idx = N-(K%N);
				int pos = array.indexOf(" ");

				//Get Index
				while(--idx > 0 && pos != -1 ){
					pos = array.indexOf(" ", pos+1);
				}

				System.out.println(array.substring(pos+1,array.length()) + " " + array.substring(0,pos));
			}
		}
	}
}
