package LeetCodeQuestions;

import java.util.Stack;

public class ValidParenthesis {
	
	 public boolean isValid(String s) {
	        
	        Stack<Character> st = new Stack<Character>();
	        for(char ch : s.toCharArray()){
	            if(ch=='(' || ch=='[' || ch=='{'){
	                st.add(ch);
	            }else{
	                if(st.isEmpty()) return false;
	                if(ch ==')' && st.peek()!='(') return false;
	                if(ch == ']' && st.peek()!= '[') return false;
	                if(ch == '}' && st.peek()!= '{') return false;

	                st.pop();
	                
	            }
	        }
	        return st.isEmpty();
	    }
	public static void main(String[] args) {
		ValidParenthesis vp = new ValidParenthesis();
		boolean b = vp.isValid("()[]{]");
		System.out.println(b);
		
	}
}
