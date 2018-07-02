package codility.countingElements;

import java.util.Arrays;

public class TestSkPlanet02 {

	public static void main(String[] args) {
		int[] price = new int[] {13,7,3,7,5,16,12};
		int length = price.length;
		int[] result = new int[length];
		for(int i=0; i < length; i++) {
			
			if(i == length-1) {
				result[i] = -1;
			}
			for(int j=i+1; j < length; j++) {
				if(price[j] > price[i]) {
					result[i] = j-i;
					break;
				} else {
					result[i] = -1;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		
	}

}
