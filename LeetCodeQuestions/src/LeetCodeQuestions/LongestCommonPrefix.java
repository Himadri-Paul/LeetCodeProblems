package LeetCodeQuestions;

/*Input: strs = ["flower","flow","flight"]
Output: "fl"*/

public class LongestCommonPrefix {

public String longestCommonPrefix(String[] strs) {
     String common = strs[0];
     for(int i=0;i<strs.length;i++) {
    	 while(strs[i].indexOf(common)!=0) {
    		 common = common.substring(0,common.length()-1);
    	 }
     }
     return common;
    }
	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		LongestCommonPrefix lp = new LongestCommonPrefix();
		String common = lp.longestCommonPrefix(strs);
		System.out.println(common);
		
	}
}
