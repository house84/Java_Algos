import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadLayout {
	QuadLayout(int[] array, int targetSum){
		List A = threeNumberSum(array,targetSum);
		for(int i=0; i < A.size(); ++i){
			System.out.println(A.get(i));
		}
	};

	List<Integer[]> threeNumberSum(int[] array, int targetSum){
		Arrays.sort(array);
		List A = new ArrayList();

		for(int i = 0; i < array.length ; i++){
			int num1 = array[i];

			for(int j = i+1; j < array.length; j++){
				int num2 = array[j];

				for(int z = j+1; z < array.length; z++){
					int num3 = array[z];

					if(num1+num2+num3 == targetSum){

						A.add(new int[]{num1,num2,num3});
					}
				}
			}
		}
		return A;
	}
}
