package recursiveCall;

public class RecursiveCall {

	public static void main(String[] args) {
//		System.out.println("Sum = "+recursiveCallPlus(0));
//		System.out.println("Minus = "+recursiveCallMinus(10));
		System.out.println("Minus = "+recursiveCallTrue());
	}
//	재귀호출 (1~10까지 합계)
	static int recursiveCallPlus(int sum) {
		
		if(sum == 10) {
			return 10;
		}
		sum = sum + recursiveCallPlus(sum + 1);
		return sum;
	}
	
	static int recursiveCallMinus(int minus) {
		System.out.println("Up : "+minus);
		if(minus == 1) {
			return 1;
		}
		minus = minus + recursiveCallMinus(minus - 1); 
		System.out.println("Down : "+minus);
		return minus;
	}
	
	static boolean recursiveCallTrue() {
		
		for(int i=0; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("count i = "+i);
			
			if(i==10) {
				return true;
			}
		}
		return recursiveCallTrue();
	}
	
	
	
}
