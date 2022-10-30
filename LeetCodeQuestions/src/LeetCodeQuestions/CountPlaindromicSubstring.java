 package LeetCodeQuestions;

import java.util.Scanner;

public class CountPlaindromicSubstring {

	public static void main(String[] args) {
		
		System.out.println("Enter your string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		boolean[][] dp = new boolean[s.length()][s.length()];
		int count = 0;
		int len = 0;
		
		for(int g = 0; g <s.length(); g++) {
			
			for(int i=0, j=g; j < dp.length; j++, i++) {
				
				if(g==0) {
					dp[i][j] = true;
				}else if(g == 1) {
					if(s.charAt(i) == s.charAt(j)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
					} 
				}else {
					if(s.charAt(i)==s.charAt(j) && s.charAt(i+1)==s.charAt(j-1)) {
						dp[i][j] = true;
					} else {
						dp[i][j] = false;
				}
			}
				if(dp[i][j] == true) {
					count++;
				}
				if(dp[i][j] == true) {
					len = g + 1;
				}
		  }
	   }
		System.out.println("total palindroic substring is: " + count + "\nlength of longest palindromic substring is: "+ len);
	  }
	}
