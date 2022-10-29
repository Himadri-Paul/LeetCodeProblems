package LeetCodeQuestions;

import java.util.HashSet;

//Longest Substring Without Repeating Characters

public class LongestSubStWitoRepating {

	public int LenghtOfString(String s) {
		int a = 0;
		int b = 0;
		int max = 0;
		
		HashSet<Character> hs = new HashSet<>();
		
		while(b < s.length()) {
			if(!hs.contains(s.charAt(b))) {
				hs.add(s.charAt(b));
				b++;
				max = Math.max(hs.size(), max);
			}else {
				hs.remove(s.charAt(a));
				a++;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		 LongestSubStWitoRepating sb = new  LongestSubStWitoRepating();
		 System.out.println(sb.LenghtOfString("abcabcbb"));
	}
}
