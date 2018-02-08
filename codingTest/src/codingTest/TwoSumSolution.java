package codingTest;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution {
	
	 public int[] twoSum(int[] nums, int target) {
	        
        int result[] = new int[2];
        
        if(nums == null || nums.length < 2) {
        	result = new int[] {0, 0};
        	return result;
        }
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		result = new int[] {map.get(nums[i]), i};
        		return result;
        	} else {
        		map.put(target-nums[i], i);
        	}
        }
        
        /* 원초적..
        for(int i = 0; i < nums.length; i++) {
        	int tarVal = target-nums[i];
        	
        	if(tarVal == 0) {
        		result = new int[] {i, nums[i]};
        		break;
        	} else {
        		for(int j = i+1; j < nums.length; j++) {
        			if( tarVal == nums[j] ) {
        				result = new int[] {nums[i], nums[j]};
        				break;
        			}
        		}
        	}
        	
        }
        */
        return result;
    }
    
    public static void main(String[] args) {
    	
    	int[] nums = {1,2,7,15};
    	int target = 9;
        
    	TwoSumSolution sol = new TwoSumSolution();
        int[] result = sol.twoSum(nums, target);
        
        System.out.println("결과= "+Arrays.toString(result));
    }


}
