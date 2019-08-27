import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		String s = "hello world";
		char[] charArray = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		int ctr = 0;
		
		for(int i = 0; i < charArray.length; i++) {
			if(!set.add(charArray[i])) {
				System.out.println("Index/position of duplicate character(s): " +i);
				ctr++;
			}
		}
		System.out.println("Total number of duplicate characters: " +ctr);
	}

}
