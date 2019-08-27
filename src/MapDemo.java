import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		String s = "hello world";
		char[] charArray = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<>();
		
		for(char c : charArray) {
			if(!charMap.containsKey(c)) {
				charMap.put(c, 1);
			}
			else {
				charMap.put(c, charMap.get(c) + 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: charMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
