package practice;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice22_4 {
	public static void main(String[] args) {
		
		String yourAccount = "87";
		String yourPassword = "7414";
		
		while(true) {
			Console cs = System.console();
			cs.printf("Account: ");
			String account = cs.readLine();
			cs.printf("\n");
			cs.printf("Password: ");
			char[]ch = cs.readPassword();		//readPassword是以字符陣列輸入
			String password = String.valueOf(ch);		//將字符陣列轉為String
			cs.printf("\n");
			
				if(account.equals(yourAccount) && password.equals(yourPassword)) {
					System.out.println("Welcom");
					break;
				}else {
					System.out.println("account or password wrong , please enter again");
					cs.printf("\n");
				}
		} 
	}
}