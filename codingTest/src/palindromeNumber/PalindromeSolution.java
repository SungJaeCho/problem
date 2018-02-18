package palindromeNumber;

public class PalindromeSolution {

	public boolean isPalindrome(int x) {
		
		boolean result = false;
		
		String res;
		String answer;
		if( 0 <= x && x < 10) {
			return true;
		}
		res = String.valueOf(x);

		answer = new StringBuffer(res).reverse().toString();
		
		if( res.equals(answer) ) {
			result = true;
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		PalindromeSolution sol = new PalindromeSolution();
		int input = 1123211;
		boolean res = sol.isPalindrome(input);
		System.out.println(res);
	}
}
