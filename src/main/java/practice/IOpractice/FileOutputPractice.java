package practice.IOpractice;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class FileOutputPractice {
	public static void main(String[] args) {
		
		try {
			//呼叫FileOutputStream物件 , 並給予路徑及輸出對象檔案
			FileOutputStream obj = new FileOutputStream("C:\\JAVA_project\\Git\\demo\\output.txt");
			String str = "轟隆隆隆隆隆衝衝衝衝拉風";
			byte[] bArray = str.getBytes();		//字串轉ByteArray
			obj.write(bArray);		//將bArray輸出到檔案串流
			obj.close();		//關閉檔案輸出串流 , 此時輸出的資料才會正式輸出到指定檔案
			System.out.println("輸出成功!");
		}catch(IOException e ){
			System.out.println(e);
		}
		
	}
}