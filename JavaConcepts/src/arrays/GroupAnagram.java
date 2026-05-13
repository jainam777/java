package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String[] args) {
		String[] group = {"ate","bat","eat","tab","eta"};
		System.out.println("Group is::"+ groupAnagram(group));
	}

	public static String groupAnagram(String[] group){
		Map<String,List<String>> map = new HashMap<>();
		for(String s: group) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		String sortedKey = new String(charArray);
		if(!map.containsKey(sortedKey)) {
			map.put(sortedKey, new ArrayList<>());
		}
		map.get(sortedKey).add(s);
	}
		return map.values().toString();
	}
}
