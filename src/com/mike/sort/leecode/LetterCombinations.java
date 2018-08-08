package com.mike.sort.leecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
	static Map<Integer, String[]> map = new HashMap<Integer, String[]>();
	
	public static void main(String[] args) 
	{
		LetterCombinations lc=new LetterCombinations();
		System.out.println(lc.letterCombinations(""));
	}
	public List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		if(digits==null||"".equals(digits)) return res;
		map.put(2, new String[] { "a", "b", "c" });
		map.put(3, new String[] { "d", "e", "f" });
		map.put(4, new String[] { "g", "h", "i" });
		map.put(5, new String[] { "j", "k", "l" });
		map.put(6, new String[] { "m", "n", "o" });
		map.put(7, new String[] { "p", "q", "r", "s" });
		map.put(8, new String[] { "t", "u", "v" });
		map.put(9, new String[] { "w", "x", "y", "z" });
		backTracking(new StringBuilder(), digits, 0, res);
		return res;
	}

	private void backTracking(StringBuilder temp, String digits, int index, List<String> res) {
		if(temp.length()==digits.length())
		{
			res.add(temp.toString());
			return;
		}
		int sint=Integer.parseInt(String.valueOf(digits.charAt(index)));
		for(int i=0;i<map.get(sint).length;i++)
		{
			temp.append(map.get(sint)[i]);
			backTracking(temp, digits, index+1, res);
			if(temp.length()>0)
			{
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
}
