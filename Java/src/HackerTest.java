import java.util.*;
public class HackerTest {

	HackerTest(){

		Scanner s = new Scanner(System.in);
		int count = 0;
		String A;
		A = s.nextLine();
		String P;
		P = s.nextLine();

		for(int i = 0; i < A.length(); ++i){

			if(A.charAt(i) == P.charAt(i)){ count++; }
		}

//		System.out.println(stringCompare(A,P));

		System.out.println(count);
	}
}
