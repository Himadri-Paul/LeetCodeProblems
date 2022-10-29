package LeetCodeQuestions;

import java.util.HashSet;
import java.util.Set;

public class DupliacteStrings {

	public static void main(String[] args) {
		
		String s = "HimadriPaul";
		Set seen = new HashSet();
		for(int i=0;i<s.length();i++) {
			if(!seen.add(s.charAt(i))) {
				System.out.println("duplicates are: "+s.charAt(i));
			}
		}
		
	}
}
