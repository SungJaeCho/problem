package reverseInteger;

/**
 * @author Sungjae.Cho
 *
 * int형 숫자 뒤집기. 앞에 0이 있을경우 제거
 * 
 */
public class Solution {
	
	public int reverse(int x) {
		
		/*
		String res = "";
		int res_int = 0;
		String tempRes = null ;
		
		if(x == 0 ) {
			return 0;
		}
		
		if(x < 0) {
			tempRes = String.valueOf(x);
			tempRes = tempRes.replace("-", "");
			res = "-";
		}else {
			tempRes = String.valueOf(x);
		}
		res = res + new StringBuffer(tempRes).reverse().toString();
		res_int = Integer.parseInt(res);
		
		
		return res_int;
		*/
		
		long answer = 0; // return값에서 Integer값이랑 비교해야 하기때문에 long형으로 생성
		
		while( x!=0 ) { // 몫이 0이 아닐경우
			answer = 10 * answer + x % 10; //몫에 10을 곱하면서 나머지를 더함
			x /= 10; //몫을 나눔
		}
		return (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) ? 0 : (int)answer;

		
	}
	
	public static void main(String[] args) {
		int x = -230;
		Solution sol = new Solution();
		x = sol.reverse(x);
		
		System.out.println(x);
	}

}
