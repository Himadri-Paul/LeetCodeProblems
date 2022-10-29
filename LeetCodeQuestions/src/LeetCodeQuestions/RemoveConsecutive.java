package LeetCodeQuestions;

public class RemoveConsecutive {
	
	public  String Consecutive(String s) {
		
		String res = "";
		
		for(int i= 0; i<s.length();i++) {
			
			if(i<s.length()-1  && s.charAt(i) == s.charAt(i+1) ) {
				continue;
			}else {
				 res = res + s.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		
		RemoveConsecutive rm = new RemoveConsecutive();
		String s = rm.Consecutive("commpuutteer");
		System.out.println(s);
	}
}
