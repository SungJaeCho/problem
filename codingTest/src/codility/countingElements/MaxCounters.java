package codility.countingElements;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		int N = 5;
		int[] A = new int[] {3,4,4,6,1,4,4};
		int[] result = new int[N];
		int maxCnt = 0;
		int tempMaxCnt = 0;
		
		for(int i=0; i < A.length; i++) {

			if(A[i] >= 1 && A[i] <= N) {
				tempMaxCnt = result[A[i]-1]; //해당 위치의 값을 temp에 넣고
				tempMaxCnt++;
				result[A[i]-1] = tempMaxCnt;
				if(tempMaxCnt > maxCnt) {
					maxCnt = tempMaxCnt;
				}
			}
			if(A[i] == N+1) {
				Arrays.fill(result, maxCnt);
			}
		}
		
		
		System.out.println(Arrays.toString(result));
	}

}
