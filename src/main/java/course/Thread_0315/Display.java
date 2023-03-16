package course.Thread_0315;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Display {
	public static void main(String[] args) {
		
		HorseRacing horseA = new HorseRacing("A");
		HorseRacing horseB= new HorseRacing("B");
		Thread t1 = new Thread(horseA);
		Thread t2 = new Thread(horseB);
		System.out.println("=====單純run方法=====");
		horseA.run();
		horseB.run();
		System.out.println("=====執行緒開始=====");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}
}