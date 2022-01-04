import java.util.*;
enum days{Mon, Tue, Wed, Thu, Fri, Sat, Sun}
public class WeekDay {

	public WeekDay(){
		HashMap<String, Integer> hash = new HashMap<>();
		HashMap<Integer, String> hash2 = new HashMap<>();
		hash.put("Mon", 0);
		hash2.put(0, "Mon");
		hash.put("Tue", 1);
		hash2.put(1, "Tue");
		hash.put("Wed", 2);
		hash2.put(2, "Wed");
		hash.put("Thu", 3);
		hash2.put(3, "Wed");
		hash.put("Fri", 4);
		hash2.put(4, "Fri");
		hash.put("Sat", 5);
		hash2.put(5, "Sat");
		hash.put("Sun", 6);
		hash2.put(6, "Sun");

		String s = "Sat";
		int k = 23;

		int a = hash.get(s);
		int DOW = (a+k)%7;

		System.out.println(hash2.get(DOW));
	}


}
