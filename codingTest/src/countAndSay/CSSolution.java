package countAndSay;

/**
 * @author Administrator
 * Count ans Say
 */
public class CSSolution {

	public String countAndSay(int n) {
		
		if(n <= 0) {
			return "";
		}
		String curr = "1"; //현재 
		String prev = "";  //과거
		int count;
		char say;
		
		for(int i=1; i<n; i++) {
			prev = curr;
			curr = "";
			count = 1;
			say = prev.charAt(0);
			for(int j=1; j < prev.length(); j++) {
				if(prev.charAt(j) != say) {
					curr = curr + count + say;
					say = prev.charAt(j);
					count = 1;
				} 
				else {
					count++;
				}
			}
			
			curr = curr + count + say;
		}
		
		System.out.println("CountAndSay= "+curr);
		return curr;
	}
	
	public static void main(String[] args) {
		CSSolution sol = new CSSolution();
		int n = 5;
		sol.countAndSay(n);
	}
}
