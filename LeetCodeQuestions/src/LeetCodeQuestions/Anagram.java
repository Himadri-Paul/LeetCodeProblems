package LeetCodeQuestions;

public class Anagram {
	
	 public boolean isAnagram(String s, String t) {
	        
	        if(s.length()!= t.length()) return false;
	        int[] cnt = new int[26];
	        for(char ch : s.toCharArray()){
	            cnt[ch-'a']++;
	        }
	        for(char ch : t.toCharArray()){
	            if(cnt[ch-'a'] ==  0) return false;
	            cnt[ch-'a']--;
	        }
	        return true;
	    }
	
	public static void main(String[] args) {
		
		Anagram ag = new Anagram();
		boolean b = ag.isAnagram("tit", "itt");
		System.out.println(b);
	}
}
