package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		HashMap<Character, Integer> mapP = new HashMap<>();
		HashMap<Character, Integer> tempMap = new HashMap<>();

		for (char c : p.toCharArray()) // store p char and occurrence into mapP
			mapP.put(c, mapP.getOrDefault(c, 0) + 1);

		for (int i = 0; i < s.length(); i++) // iterate s and update a tempMap with p len
		{
			char c = s.charAt(i);
			char leftC;

			tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);

			if (i >= p.length()) // once reach to p's length, remove most left char
			{
				leftC = s.charAt(i - p.length());
				// remove left char
				if (tempMap.get(leftC) == 1)
					tempMap.remove(leftC);
				else
					tempMap.put(leftC, tempMap.get(leftC) - 1);
			}

			if (tempMap.equals(mapP))
				list.add(i + 1 - p.length());

		}

		return list;
	}
}
