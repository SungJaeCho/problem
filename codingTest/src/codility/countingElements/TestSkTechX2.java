package codility.countingElements;

import java.util.Arrays;
import java.util.TreeMap;

public class TestSkTechX2 {

	public static void main(String[] args) {
		int[] A = new int[] {-1,1,3,3,3,2,3,2,1,0};
		
		int sum = 0;
		int tempSum = 0;
		int count = 0;
		int continueCnt = 1;
		
		for(int i = 1 ; i < A.length; i++) {
			if(i == 1) {
				sum = A[i] - A[0]; 
			} else {
				sum = A[i] - A[i-1];
			}
			if(tempSum == sum) {
				continueCnt++;
				if(continueCnt > 1) {
					count++;
				}
				count += continueCnt/3;
			} else {
				tempSum = sum;
				continueCnt = 1;
			}
//			System.out.println("tempSum"+tempSum);
//			System.out.println("sum"+sum);
	
		
		
		if(count > 1000000000) {
			count = -1;
		}

		System.out.println(count);
		System.out.println(continueCnt);
		}
	}

}
