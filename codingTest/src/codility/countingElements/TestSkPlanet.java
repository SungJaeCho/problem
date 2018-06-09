package codility.countingElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestSkPlanet {

	public static void main(String[] args) {

		
		String[] movie = new String[] {"spy","ray","spy","room","once","ray","spy","once", "zz","zz", "za", "za" };
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		for(int i=0; i<movie.length; i++) {
			if(map.containsKey(movie[i])) {
				map.put(movie[i], map.get(movie[i]) + 1);
			} else {
				map.put(movie[i], 1);
			}
		}
		System.out.println(map);
		
		TreeMap<String,Integer> tMap = new TreeMap<String,Integer>(map);
		System.out.println(tMap);
		
		List<String> list = new ArrayList();
		list.addAll(tMap.keySet());
		Collections.sort(list,new Comparator() {
            public int compare(Object o1,Object o2) {
                Object v1 = tMap.get(o1);
                Object v2 = tMap.get(o2);
                return ((Comparable) v2).compareTo(v1);
            }
        });
		
		String[] result = new String[list.size()];
		
		for(int i=0; i < list.size(); i++) {
			result[i] = list.get(i);
		}

		System.out.println(Arrays.toString(result));

		
		
		
	}

}
