package W3School;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RegEx {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher("Visit W3Schools!");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    Pattern pattern2 = Pattern.compile("[A-Z]");		//只要有範圍大寫A-Z的字母
	    Matcher matcher2 = pattern.matcher("Visit W3Schools!");
	    boolean matchFound2 = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    Pattern pattern3 = Pattern.compile("[ixz]");		//只要有 i , x , z其中任意一個字
	    Matcher matcher3 = pattern.matcher("Visit W3Schools!");
	    boolean matchFound3 = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }

	}
}