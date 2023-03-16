package practice;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice21_2and3 implements Runnable {
	String name;
	
	public Practice21_2and3(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i = 0 ; i <= 15 ; i ++) {
			System.out.println(name + "跑了第" + i + "圈");
		}
	}
	public static void main(String[] args) {
		
		Practice21_2and3 horseA = new Practice21_2and3("A");
		Practice21_2and3 horseB = new Practice21_2and3("B");
		Practice21_2and3 horseC = new Practice21_2and3("C");
		Practice21_2and3 horseD = new Practice21_2and3("D");
		Practice21_2and3 horseE = new Practice21_2and3("E");
		
		//使用Runnable的話 , Class內沒有Thread的method , 必須要再把Thread呼叫出來 , 帶入Class
		Thread t1 = new Thread(horseA);
		Thread t2 = new Thread(horseB);
		Thread t3 = new Thread(horseC);
		Thread t4 = new Thread(horseD);
		Thread t5 = new Thread(horseE);
		
		//以Thread執行start , 因為不是用繼承的 , Class內沒有start這個method
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();	
	}
}