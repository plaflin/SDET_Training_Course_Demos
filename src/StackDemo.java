import java.util.Stack;

public class StackDemo {

	static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : s.toCharArray()) {
			if(c == '{' || c == '[' || c == '(') {
				stack.push(c);
			}
			else if(c == '}'){
				if(!(stack.pop() == '{')) {
					return false;
				}
			}
			else if(c == ']'){
				if(!(stack.pop() == '[')) {
					return false;
				}
			}
			else if(c == ')'){
				if(!(stack.pop() == '(')) {
					return false;
				}
			}
		}
		
		if(!(stack.empty())) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "{[()]}"; // balanced
		String s2 = "{}[]()"; // balanced
		String s3 = "{[(])}"; // not balanced
		String s4 = "{}[]("; //  not balanced
		
		System.out.println("s1 is balanced: " + isBalanced(s1));
		System.out.println("s2 is balanced: " + isBalanced(s2));
		System.out.println("s3 is balanced: " + isBalanced(s3));
		System.out.println("s4 is balanced: " + isBalanced(s4));

	}

}
