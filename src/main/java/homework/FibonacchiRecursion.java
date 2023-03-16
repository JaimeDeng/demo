package homework;
import java.util.Scanner;

public class FibonacchiRecursion {
	
	//method 計算此索引的費式數列值
	public static int fib (int n) {
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
		//遞迴結果必定是0或1的相加
	}
	//method 計算此索引的費式數列值

	public static void main(String[] args) {
		
		int n = 10; //數列長度
		for(int i = 0 ; i < n ; i++) {
			System.out.print(fib(i) + " ");
		}
		
	}
}