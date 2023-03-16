package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0306 {
	public static void main(String[] args) {
		
		Bank taipeiBank = new Bank("WOW");
		Scanner scan = new Scanner(System.in);
		System.out.println("請設定密碼:");
		taipeiBank.setPassword(scan.nextInt());
		System.out.println("請輸入密碼:");
		taipeiBank.login(scan.nextInt());
		taipeiBank.getPerBalance();
		System.out.println("請輸入存款金額:");
		taipeiBank.save(scan.nextInt());
		taipeiBank.getPerBalance();
		
	}
}