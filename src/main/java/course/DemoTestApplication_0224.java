package course;
import java.util.Scanner;


public class DemoTestApplication_0224 {
	public static void main(String[] args) {
		
		//階乘練習題
    	Scanner scan = new Scanner(System.in);
        System.out.println("請輸入要計算階乘的數字");
		int input = scan.nextInt();
		int num = 1; //因為是乘法,容器必須設為1,否則不管怎麼乘都會是0
		for (int i = input  ; i > 0 ; i--) { //由輸入的數字開始遞減
			num *= i;
 		}
		System.out.println(num);
		
	}
}