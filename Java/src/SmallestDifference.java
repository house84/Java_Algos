import java.util.ArrayList;
import java.util.Arrays;

public class SmallestDifference {
	SmallestDifference(int[] arrayOne, int[] arrayTwo){
		System.out.println(Arrays.toString(SD(arrayOne, arrayTwo)));
	};

	private int[] SD(int[] arrayOne, int[] arrayTwo){

		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		int i = 0, j = 0, bestI = 0 , bestJ = 0, least = Integer.MAX_VALUE, diff = Integer.MAX_VALUE;

		while(true){
			if(i == arrayOne.length || j == arrayTwo.length){ break; }
			diff = Math.abs((arrayOne[i]-arrayTwo[j]));
			if( diff == 0){ return new int[] {arrayOne[i], arrayTwo[j]}; }
			if(diff < least) {
				least = diff;
				bestI = i;
				bestJ = j;
			}
			if(arrayOne[i] < arrayTwo[j]){ ++i; }
			else{ ++j;}
		}

		return new int[] {arrayOne[bestI], arrayTwo[bestJ]};
	}

}
