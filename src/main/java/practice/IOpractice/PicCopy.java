package practice.IOpractice;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class PicCopy {
	public static void main(String[] args) {
		
		//圖檔複製 & BufferIO
		try {
			Console cs = System.console();
			cs.printf("Please input the file's name(including extension) which you want to copy:\n");
			String input = cs.readLine();
			FileInputStream src = new FileInputStream("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice\\" + input);
			BufferedInputStream srcBuf = new BufferedInputStream(src);		//將InputStream添加至Buffer
			cs.printf("\n");
			cs.printf("Please input the duplicate file's name(including extension):\n");
			String output = cs.readLine();
			FileOutputStream out = new FileOutputStream("C:\\JAVA_project\\demo_test\\src\\main\\java\\practice\\IOpractice\\" + output);
			BufferedOutputStream outBuf = new BufferedOutputStream(out);		////將OutputStream添加至Buffer
			System.out.println("File byte: " + src.available());
			byte[] pic = new byte[src.available()];		//建立一個byte陣列 , 大小為來源的byte
			
			srcBuf.read(pic);		//將srcBuffer的圖檔讀取byte存入byte陣列
			outBuf.write(pic);		//將byte陣列的內容寫入outBuffer對象檔案
			outBuf.flush();		//將緩衝區串流資料寫入目的地
			srcBuf.close();
			src.close();
			out.close();		//關閉輸入跟輸出&buffer的串流
			
			System.out.println("Copy complete!");
		}catch(IOException e ){
			System.out.println(e);
		}
		
	}
}