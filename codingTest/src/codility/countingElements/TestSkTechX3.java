package codility.countingElements;

import java.util.Stack;

public class TestSkTechX3 {

	public static void main(String[] args) {
		String S = "13 DUP 4 POP 5 DUP + DUP + -";
		String[] arrStr = S.split("\\s+");
		int result = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		try {
			for(String str : arrStr) {
				
				if("POP".equals(str)) {
					stack.pop();
				} else if("DUP".equals(str)) {
					int peek = stack.peek();
					stack.push(peek);
				} else if("+".equals(str)) {
					int first = stack.pop();
					int second = stack.pop();
					stack.push(first+second);
				} else if("-".equals(str)) {
					int first = stack.pop();
					int second = stack.pop();
					stack.push(first-second);
				} else {
					stack.push(Integer.parseInt(str));
				}
			}
			result = stack.peek();
		} catch (Exception e) {
			result = -1;
		}
//		return result;
	}

}
