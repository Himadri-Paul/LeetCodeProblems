package LeetCodeQuestions;

import java.util.HashMap;
import java.util.Map;

//Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence. 

public class NumberPadSequence {

	public static String stringToNumericKeypad(String str)
	{
	 str=str.toLowerCase();
	 String s = "";
	 Map<Character, String> map = new HashMap<>();
	 map.put('g', "4"); //similarly do for a-z
	 map.put('e', "33");
	 map.put('k', "55");
	 map.put('s', "7777");
	 map.put('f', "333");
	 map.put('o', "666");
	 map.put('r', "777");
	 map.put(' ', "0");
	 for(int i=0; i<str.length(); i++) {
	  char c = str.charAt(i);
	  s = s + map.get(c);
	 }
	 return s;
	}

	public static void main(String args[])
	{
	 String str="GeEkS FOr GEEKS";
	 System.out.println(stringToNumericKeypad(str));
	}
}
