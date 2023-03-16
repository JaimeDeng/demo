package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice16_3_Abstract {
	public static void main(String[] args) {
		
		MathTest mathTest = new MathTest();
		mathTest.output();
		//MathTest繼承自Abstract Superclass的一般method
		System.out.println("加法結果: " + mathTest.add(10 , 3));
		System.out.println("減法結果: " + mathTest.mns(10 , 3));
		System.out.println("乘法結果: " + mathTest.mul(10 , 3));
		System.out.println("除法結果: " + mathTest.div(10 , 3));
		
	}
}