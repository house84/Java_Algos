import java.util.*;

public class Change {

	public Change(int[] coins){ System.out.println(getChange(coins));}

	private int getChange(int[] coins) {
		Arrays.sort(coins);
		int coinSum = 0;

		for(int i = 0; i < coins.length; ++i){
			if(coins[i] > coinSum + 1){ return coinSum+1; }

			coinSum += coins[i];
		}
		//System.out.println(Arrays.toString(coins));
		return coinSum+1;
	}

}
