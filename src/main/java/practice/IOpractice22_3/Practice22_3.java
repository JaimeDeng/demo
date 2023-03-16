package practice.IOpractice22_3;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice22_3 {
	public static void main(String[] args) {
		
		try {
			int i;	//讀取到的字符編碼容器
			FileReader input1 = new FileReader("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice22_3\\1.txt");
			FileReader input2 = new FileReader("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice22_3\\2.txt");
			FileReader input3 = new FileReader("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice22_3\\3.txt");
			FileWriter output = new FileWriter("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice22_3\\out.txt");
			
			while((i = input1.read()) != -1) {		//讀取到末端-1為止
				char ch = (char) i;		//int轉char
				output.write(ch);		//write字符
			}
			output.write("\n");		//write跳行
			while((i = input2.read()) != -1) {
				char ch = (char) i;
				output.write(ch);
			}
			output.write("\n\n");
			while((i = input3.read()) != -1) {
				char ch = (char) i;
				output.write(ch);
			}
			
			
			input1.close();
			input2.close();
			input3.close();
			output.close();
			
			System.out.println("輸出完成");
			
		}catch(IOException e ){
			System.out.println(e);
		}
		
	}
}