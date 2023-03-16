package practice;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice_ch21_2 extends Thread {
	String name;
	public Practice_ch21_2(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(name + " is running : " + i);
		}
	}
	
	public static void main(String[] args) {
		Practice_ch21_2 thread1 = new Practice_ch21_2("Horse");
		Practice_ch21_2 thread2 = new Practice_ch21_2("Rabbit");
		Practice_ch21_2 thread3 = new Practice_ch21_2("Turtle");
		System.out.println("Horse的優先值: " + thread1.getPriority());
		System.out.println("Rabbit的優先值: " + thread2.getPriority());
		System.out.println("Turtle的優先值: " + thread3.getPriority());

		thread1.setPriority(MAX_PRIORITY);
		thread2.setPriority(NORM_PRIORITY);
		thread3.setPriority(MIN_PRIORITY);
		
		System.out.println("Horse的優先值: " + thread1.getPriority());
		System.out.println("Rabbit的優先值: " + thread2.getPriority());
		System.out.println("Turtle的優先值: " + thread3.getPriority());
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
}