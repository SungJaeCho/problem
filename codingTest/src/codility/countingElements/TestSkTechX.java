package codility.countingElements;

import java.util.Arrays;
import java.util.TreeMap;

public class TestSkTechX {

	public static void main(String[] args) {
		String S = "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, Penny Parker";
		String C = "Example";

		String[] arrStr = S.split(",");
		String[] arrTempStr = new String[arrStr.length];
		String rstStr = "";
		
		String last = "";
		String first = "";
		for(int i=0; i<arrStr.length; i++) {
			String[] arrayStr = arrStr[i].split("\\s+");
			if(i == 0) {
				first = arrayStr[0].toLowerCase().replaceAll("[\\-]", "");
			} else {
				first = arrayStr[1].toLowerCase().replaceAll("[\\-]", "");
			}
			last = arrayStr[arrayStr.length-1].toLowerCase().replaceAll("[\\-]", "");
			
			arrTempStr[i] = last + first.substring(0, 1);
//			System.out.println(arrTempStr[i]);
			
		}
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		for(int i=0; i<arrTempStr.length; i++) {
			if(map.containsKey(arrTempStr[i])) {
				map.put(arrTempStr[i], map.get(arrTempStr[i]) + 1);
			} else {
				map.put(arrTempStr[i], 1);
			}
			int num = map.get(arrTempStr[i]);
			if( num == 1) {
				rstStr += arrTempStr[i] + "@" + C.toLowerCase() + ".com, ";
			} else {
				rstStr += arrTempStr[i] + map.get(arrTempStr[i]) + "@" + C.toLowerCase() + ".com, ";
			}
			
		}
//		System.out.println(rstStr.substring(0, rstStr.length() -2));
		String result = rstStr.substring(0, rstStr.length() -2);
	}

}
