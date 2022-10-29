package LeetCodeQuestions;

public class Palindrome {

	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        
        StringBuilder ab = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                ab.append(s.charAt(i));
            }
        }
        int n = ab.length()-1;
        for(int i = 0; i<ab.length()/2; i++){
            if(ab.charAt(i)!= ab.charAt(n-i))return false;
        }
         return true;
                                 
     }
	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		Boolean s = p.isPalindrome("LOL");
		System.out.println(s);
		
		
	}
}
