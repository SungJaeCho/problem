package codility.countingElements;

import java.util.Arrays;

public class CodingTest {

	public static void main(String[] args) {
		/*
		String s = "a0aa";
		int result = -1;
				
		s = s.replaceAll("[0-9]", " ");
		System.out.println(s);
		String[] arrayStr = s.split("\\s+");
		for(String str : arrayStr) {
			if(str.matches(".*[A-Z].*")) {
				System.out.println("대문자있음 :"+str);
				if(str.length() > result) {
					result = str.length();
				}
			}
		}
		System.out.println(result);
		*/
		/*
		int[] A = new int[] {-8,4,0,5,-3,6};
		int maxNum = 0;
		int tempNum = 0;
		
		if(A.length == 1) {
			maxNum = A[0];
		} else {
			for(int P=0; P < A.length; P++) {
				
				for(int Q=P; Q < A.length; Q++) {
					tempNum = A[P]+A[Q]+(Q-P);
					if(maxNum < tempNum) {
						maxNum = tempNum;
					}
				}
			}
		}
		
		System.out.println(maxNum);
		*/
		int K = 4;
		int[] A = new int[] {1,2,3,4};
		int temp;
		if(K == 0) {
			
		} else {
			
			for(int i = 0; i < K; i++) {
				
				temp = A[A.length-1];
//			System.out.println(temp);
				
				for(int j = A.length-2; j >= 0; j--) {
					A[j+1] = A[j];
//				System.out.println(j);
				}
				A[0] = temp;
				System.out.println(Arrays.toString(A));
			}
		}
		





	}
}
