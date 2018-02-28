package combinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
	The same repeated number may be chosen from C unlimited number of times.
	후보 수 (C) (중복 없음)와 대상 수 (T)가 주어지면 C에서 후보 수의 합이 T 인 모든 고유 조합을 찾습니다.
	C에서 무제한 반복 횟수를 선택할 수 있습니다.
 */
public class CsSolution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> res = new ArrayList<>();
    	Arrays.sort(candidates);
    	//결과 리스트, 담는용도의 리스트, 후보num값, 목표값, 시작값
    	backtrack(res, new ArrayList<>(), candidates, target, 0);
    	System.out.println(res);
    	return res;
    }
    
    private void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int remain, int start) {
    	if(remain < 0) {
    		System.out.println("더이상 뺄수 없다.");
    		return;
    	}
    	else if(remain == 0) {
    		res.add(new ArrayList<>(tempList));
    		System.out.println("담음");
    	}
    	else {
    		for(int i = start; i < candidates.length; i++) {
    			tempList.add(candidates[i]);
    			System.out.println("i: "+i+" ///remain: "+remain+" ///tempList: "+tempList+"  start "+start);
    			backtrack(res, tempList, candidates, remain-candidates[i], i);
    			tempList.remove(tempList.size()-1);
    		}
    	}
    	
    }
    
    public static void main(String[] args) {
    	int target = 7;
    	int[] candidates = {2,3,6,7};
    	
    	CsSolution sol = new CsSolution();
    	sol.combinationSum(candidates, target);
		
	}
}
