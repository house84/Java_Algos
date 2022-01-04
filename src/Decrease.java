import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Decrease {
		//ASCII lower case 97-122
		//N = Palindrome Length, K = Distinct Lower Case Letters
		public Decrease(int N, int K){

			Random r = new Random();
			int[] ArrN = new int[N];
			int[] ArrK = new int[K];
			List<Integer> ListK = new ArrayList<Integer>();

			for(int i = 0; i < ArrK.length; ++i){
				boolean test = false;
				int charV = 0;
				while(test == false){
					charV = r.nextInt(26)+97;
					if(!ListK.contains(charV)){
						ListK.add(charV);
						test = true;
					}
				}
				ArrK[i] = charV;
			}

			List<Integer> ListP = new ArrayList<Integer>();
			int[] pal = new int[N/2];
			for(int i = 0; i < pal.length; ++i){
				boolean test = false;
				int idxP = 0;
				while(test == false){
					idxP = r.nextInt(pal.length);
					if(!ListP.contains(idxP)){
						ListP.add(idxP);
						test = true;
					}
				}
				pal[i]=ArrK[idxP];
			}
			String palindrome = "";
			if(N%2 == 0){
				for(int i = 0; i < N/2; ++i){
					palindrome += Character.toString(pal[i]);
				}
				for(int i = N/2-1; i >= 0; --i){
					palindrome += Character.toString(pal[i]);
				}
			}
			else{
				for(int i = 0; i < N/2; ++i){
					palindrome += Character.toString(pal[i]);
				}

				boolean test = false;
				int charV = 0;
				while(test == false){
					charV = r.nextInt(26)+97;
					if(!ListK.contains(charV)){
						ListK.add(charV);
						test = true;
					}
				}
				palindrome += Character.toString(charV);
				for(int i = N/2-1; i >= 0; --i){
					palindrome += Character.toString(pal[i]);
				}
			}

			System.out.println(palindrome);
		}
}

