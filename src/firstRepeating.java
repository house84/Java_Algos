import java.util.*;
//This class takes a string, checks its entirety then returns the earliest
//occurring char that is duplicated at some point within the String
// Example: Input: absolutebolderDash
//          Output: a

public class firstRepeating {
		firstRepeating(){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ret = "";
		int lowest = Integer.MAX_VALUE;

		HashMap<Integer, Character> hash = new HashMap<>();
		for(int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (hash.containsValue(c)) {

				for(Map.Entry<Integer, Character> entry: hash.entrySet()){
					if(entry.getValue().equals(c)){
						if(entry.getKey() < lowest){
							lowest = entry.getKey();
							ret = Character.toString(c).trim();
						}
					}
				}
			}else{ hash.put(i,c); }
		}
		System.out.println(ret);
	}
}
