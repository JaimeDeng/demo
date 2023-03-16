package course;
import java.util.Random;
import java.util.Scanner;


public class DemoTestApplication_0222 {
	public static void main(String[] args) {
		//遞增遞減運算子
		int ii , j , i2 , i3;
		ii = j = 10;
		i2 = ii++ * 10;
		System.out.println(i2); //因為先執行程序所以顯示100,但此時i已經+1
		i3 = ii * 10;
		System.out.println(i3); //再代入一次i再算一次,驗證輸出確實為11*10 = 110
		j = ++j * 10;
		System.out.println(j); //先執行加1才執行程序,所以直接輸出110
		System.out.println();
		
		//not 反向運算子
		boolean bo;
		bo = true;
		System.out.println(!bo);
		System.out.println();
		
		//三元運算子
		int a = 100;
		int b = 50;
		int c; //如果 a > b , c = 77 , otherwise c = 88
		c = a > b ? 77 : 88;
		System.out.println(c);
		int d = 20;
    	int e = 30;
		int f; //如果 d < e , f = 66 , otherwise c = 55
		f = d < e ? 66 : 55;
		System.out.println(f);
		System.out.println();
		
		//Scanner螢幕輸入
		Scanner scan = new Scanner(System.in);
		int abc , bca ;
		System.out.println("輸入兩個數字,用空白間隔");
		abc = scan.nextInt();
		bca = scan.nextInt();
		System.out.println("你輸入的是" + abc + "跟" + bca);
		System.out.println();
		
		//next % nextLine
		Scanner scanA = new Scanner(System.in);
		Scanner scanA2 = new Scanner(System.in);
		System.out.println("next 輸入您的姓名");
        String name = scanA.next();
        System.out.println("nextLine 再次輸入您的姓名");
        String name2 = scanA2.nextLine();
        System.out.printf("next 你好! %s%n", name);
        System.out.printf("nextLine 你好! %s%n", name2);
        System.out.println();
		
		//攝氏華氏溫度轉換
     	Scanner scanner = new Scanner(System.in);
		int input , inputT , celsius , fahrenheit;
		do {
			System.out.println("攝氏轉華氏輸入1 , 華氏轉攝氏輸入2");
		    input = scanner.nextInt();
		}while( input < 1 || input > 2 );
		if (input == 1) {
			System.out.println("請輸入攝氏溫度");
			inputT = scanner.nextInt();
			fahrenheit = inputT * 9 / 5 + 32;
			System.out.println("攝氏" + inputT + "度轉換華氏溫度為:" + fahrenheit + "度");
		}
		else if (input == 2) {
			System.out.println("請輸入華氏溫度");
			inputT = scanner.nextInt();
			celsius = (inputT - 32) * 5 / 9;
			System.out.println("華氏" + inputT + "度轉換攝氏溫度為:" + celsius + "度");
		}
		System.out.println();
		
		//等差數列總和
		int sum = 0;
		Scanner scanB = new Scanner(System.in);
        System.out.println("請輸入要計算等差數列總和的數字");
		int ip = scanB.nextInt();
		for (int i = 1  ; i <= ip ; i++) {
			sum += i ;
 		}
		System.out.println(sum);
		System.out.println();
	}
}