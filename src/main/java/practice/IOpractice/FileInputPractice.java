package practice.IOpractice;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class FileInputPractice {
	public static void main(String[] args) {
		
		try {
			//呼叫FileOutputStream物件 , 並給予路徑及輸入對象檔案
			FileInputStream obj = new FileInputStream("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\InputTest.txt");
			int b;
			while((b = obj.read()) != -1) {	//-1為檔案末端 , while讀到-1為止
				System.out.print((char) b);		//Byte資料轉為字符輸出
			}
			obj.close();		//關閉串流
			System.out.println();
			System.out.println("讀取完成");
		}catch(IOException e ){
			System.out.println(e);
		}
		
	}
}