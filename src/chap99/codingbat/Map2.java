package chap99.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String s : strings) {
			map.put(s, 0);
		}
		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String s : strings) {
			map.put(s, s.length());
		}
		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String s : strings) {
			map.put(s.substring(0, 1), s.substring(s.length() - 1));
		}
		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		/*
		for (String s : strings) {
			if (map.containsKey(s)) {
		
				int cnt = map.get(s);
				map.put(s, cnt + 1);
		
			} else {
				map.put(s, 1);
		
			}
		}
		*/
		for (String s : strings) {
			map.compute(s, (k, v) -> v == null ? 1 : v + 1);
		}
		return map;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String s : strings) {
			String fl = s.substring(0, 1);

			if (map.containsKey(fl)) {
				map.put(fl, map.get(fl) + s);
			} else {
				map.put(fl, s);
			}
		}
		return map;
	}

	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<>();

		for (String s : strings) {
			String key = s;

			if (map.containsKey(key)) {
				int val = map.get(key);
				val++;
				if (val % 2 == 0) {
					result += key;
				}
				map.put(key, val);
			} else {
				map.put(key, 1);
			}
		}
		return result;
	}

	public String[] allSwap(String[] strings) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < strings.length; i++) {
			String str = strings[i];
			Character key = str.charAt(0);

			if (map.containsKey(key)) {
				Integer prevIndex = map.get(key);

				String temp = strings[prevIndex];
				strings[prevIndex] = strings[i];
				strings[i] = temp;

				map.remove(key);
			} else {
				map.put(key, i);
			}
		}
		return strings;
	}
}
