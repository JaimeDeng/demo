package homework.ThreadHomework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Display {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		//精簡化的方式來執行Thread類別物件
		Thread t1 = new Thread() {		//呼叫Thread物件並建構匿名class,執行Thread物件的run()
			public void run() {
				bank.withdraw(15000);
			}
		};
		t1.start();		//start開始執行Thread
		Thread t2 = new Thread() {
			public void run() {
				bank.deposit(2000);
			}
		};
		t2.start();
		
	}
}