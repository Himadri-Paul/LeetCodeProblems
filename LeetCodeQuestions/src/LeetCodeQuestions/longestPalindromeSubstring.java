package LeetCodeQuestions;

public class longestPalindromeSubstring {

	    public String longestPalindrome(String s) {
	        boolean[][] table = new boolean[s.length()][s.length()];
	        String result = s.substring(0, 1);
	        
	        for (int i = 0; i < s.length(); i++) {
	            table[i][i] = true;
	            if (i < s.length() - 1) {
	                table[i][i+1] = s.charAt(i) == s.charAt(i+1);
	                if (table[i][i+1]) {
	                    String str = s.substring(i, i + 2);
	                    if (str.length() > result.length()) {
	                        result = str;
	                    }                    
	                }
	            }
	        }
	        
	        for (int i = s.length() - 2; i >= 0; i--) {
	            for (int j = i + 2; j < s.length(); j++) {
	                table[i][j] = s.charAt(i) == s.charAt(j) && table[i+1][j-1];
	                if (table[i][j]) {
	                    String str = s.substring(i, j + 1);
	                    if (str.length() > result.length()) {
	                        result = str;
	                    }                    
	                }
	            }
	        }
	        
	        
	        return result;
	    }

	public static void main(String[] args) {
		
		longestPalindromeSubstring sb = new longestPalindromeSubstring();
		String sub = sb.longestPalindrome("banana");
		System.out.println(sub);
		
	}
}
