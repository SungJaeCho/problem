package singleNumber;

/**
 * @author Administrator
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 정수 배열을 감안할 때, 모든 요소는 하나를 제외하고 두 번 나타납니다. 그 하나를 찾으십시오.
 * 2진수 연산
 */
public class SnSolution {
	
	public int singleNumber(int[] nums) {
        int result = 0;
        
        if(nums.length <= 0) {
        	return result;
        }
        
        for(int i=0; i < nums.length; i++) {
        	result ^= nums[i];
        }
		System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		SnSolution sol = new SnSolution();
		int[] input = {1,2,3,4,5};
		sol.singleNumber(input);
	}
}
