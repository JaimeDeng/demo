package course.Thread_Syncronization_0315;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Display {
	public static void main(String[] args) {
		
		SellTicket sell = new SellTicket();
		Thread t1 = new Thread(sell , "A機器");
		Thread t2 = new Thread(sell , "B機器");
		Thread t3 = new Thread(sell , "C機器");
		
		t1.start();
		t2.start();
		t3.start();
	}
}