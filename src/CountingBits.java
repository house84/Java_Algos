import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingBits {

	CountingBits(){

		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		String sValue; // = Integer.toString(value);
		sValue = Integer.toBinaryString(value);
		StringBuffer sbr = new StringBuffer(sValue);
//		System.out.println(sValue);
//		System.out.println(sbr.reverse());
		sbr = sbr.reverse();


		int[] arr = new int[sValue.length()];
		int count = 0;

		for(int i = sValue.length()-1; i >= 0; --i){
			if(sValue.charAt(i) == '1'){
				++count;
				arr[i] = 1;
			}
		}

		List<Integer> list=new ArrayList<Integer>();		//output[0] = count;
		list.add(count);
		System.out.println(count);
		for(int i = 0; i < arr.length; ++i){
			if(arr[i] == 1 ){
				//output[i+1] = i;
				System.out.println(i+1);
				list.add(i+1);
			}
		}

	}
}
