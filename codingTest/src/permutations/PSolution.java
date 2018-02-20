package permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * nums로 넣은 배열값의 중복을 제외한 경우의수 찾기
 *
 */
public class PSolution {
	
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> tmp = new ArrayList<Integer>();
		if(nums.length <= 0) {
			return res;
		}
		
		tmp.add(nums[0]); // 시작값을 담아둠.
		res.add(tmp); // 시작값을 세팅
		
		for(int i=1; i<nums.length; i++) {
			List<List<Integer>> nRes = new ArrayList<>();
			for(int j=0; j <= i; j++) { //i보다 한번 더 돌아야함.
//				for(List<Integer> l : res) {
//					List<Integer> nTmp = new ArrayList<Integer>(l);
				for(int k=0; k < res.size(); k++) {
					tmp = new ArrayList<Integer>(res.get(k)); //res에 담아있는 값을 순서대로 꺼내서
					tmp.add(j, nums[i]); //해당 위치에 값을 하나씩 넣어준다.
					nRes.add(tmp); // 그 후에 추가
				}
			}
			res = nRes; // i값이 추가될때마다 새로운걸 추가해줌
		}
		
//		System.out.println(res);
//		System.out.println(res.size());
		
		return res;
		
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		PSolution sol = new PSolution();
		sol.permute(nums);

	}

}
