package SelfPractice;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

// 建構重點
// 1.使用HashSet的不重複儲存相同元素特性 , 當成功存取達4位即視為數字無重複 , 作為陣列建立的檢查手段
//     *還可以使用contains方法判斷數字重複 , 請見最下方
// 2.使用數字轉字串 , 字串轉字符陣列 , 字符陣列用迴圈逐個轉換為數字並丟給數字陣列的方式作為輸入方法
// 3.使用雙迴圈逐個檢查兩個陣列的數字是否相同,位置是否相同

public class oneAtwoB_test {

    public static void main(String[] args) {
    	
    	//題目產生區
    	Random ran = new Random();
    	Scanner scan = new Scanner(System.in);
    	int arrayran[] = new int[4];
    	Set<Integer> set = new HashSet<Integer>();
    	
    	addArrayRan: while (true) {
    		set.clear();		// 清空HashSet
    		for (int i = 0; i < 4; i++) {
    			arrayran[i] = ran.nextInt(10);		// 隨機產生0~9的數字丟入陣列
	    		set.add(arrayran[i]); // 將新的數字加入HashSet
	    	}
	    	if (set.size() == 4) {		// HashSet中元素個數為4，表示沒有重複的數字
	    		break addArrayRan;		//結束迴圈
	    	}
    	}
    	System.out.println("題目是" + Arrays.toString(arrayran));
    	//題目產生區
    	
    	//玩家輸入區
    	int A = 0; //因A也同時作為迴圈條件所以要設置初始數值
    	int B;    	
    	System.out.println("請輸入4個數字:");
    	
    	//遊戲破關條件迴圈區
    	while(A < 4) {		//A沒等於4就重來
        A = 0; //重置A跟B , 否則會每次疊加
        B = 0;
    	int[] numArray = new int[4];		//建立輸入的數字陣列
    	addArrayIn: while (true) {
    		set.clear();		// 清空HashSet
    		String numString = scan.next();		//以字串輸入 , 若以數字輸入 , 第一位為0會無視
    		char[] numCharArray = numString.toCharArray();		//字串轉字符陣列(將黏在一起的數字分開)
    		if (numCharArray.length > 4) {		//以字符陣列長度判斷輸入數字長度
    			System.out.println("請勿輸入超過4位數");
    			continue addArrayIn;	//輸入超過就重新迴圈
    		}
            
            for (int i = 0; i < numCharArray.length; i++) {
                numArray[i] = Integer.parseInt(String.valueOf(numCharArray[i]));
                //使用Integer.parseInt()方法將字符陣列的每個元素轉換成整數,儲存在數字陣列
                set.add(numArray[i]);	// 將新的數字加入HashSet
            }
            if (set.size() == 4) {		// HashSet中元素個數為4，表示沒有重複的數字
            	break addArrayIn;		// 結束addArrayIn迴圈
	    	}else {
	    		System.out.println("數字重複了!");
	    	}
	    }
    	//玩家輸入區
    	
    	    //題目輸入對照檢閱區
	    	for( int i = 0 ; i < 4 ; i++ ) {		//用雙迴圈逐個對照題目跟輸入的數字
	    		for( int j = 0 ; j < 4 ; j++ ) {
	    			if(arrayran[j] == numArray[i] && j == i) {		//兩個陣列數字一樣位置一樣A+1
	    				A++;
	    			}else if( arrayran[j] == numArray[i] ) {		//只有數字一樣B+1
	    				B++;
	    			}
			    }
			}
	    	//題目輸入對照檢閱區
	    	System.out.printf("%dA%dB%n" , A , B);
    	}
    	//遊戲遊戲破關條件迴圈區
    		System.out.println("你贏了!");		//因遊戲破關條件就是A=4結束 , 所以結束直接輸出你贏了就可以
    	}
}


////contains重複數字辨別法 do while重生法
//Random ran = new Random();
//ArrayList<Integer> arrayran = new ArrayList<Integer>();
//
//while(arrayran.size() < 4) { //限制長度為4位
//    int num;
//    do {
//        num = ran.nextInt(10); //生成一個亂數給num
//    } while(arrayran.contains(num)){ // 條件:只要陣列contains有num的數字就重生亂數
//    arrayran.add(num); // 符合條件輸出的數字放入陣列
//}
//System.out.println(arrayran);
////contains重複數字辨別法 do while重生法


////contains重複數字辨別法 if判斷法
//Random ran = new Random();
//ArrayList<Integer> arrayran = new ArrayList<Integer>();
//while(arrayran.size() < 4){ //限制長度為4位
//	int num; 			
//	num = ran.nextInt(10); //給一個亂數
// 	if (!arrayran.contains(num)) { //利用contains檢查是否有相同數字
//	     arrayran.add(num); //如果沒有就加進去
//	}    		
//}
//System.out.println(arrayran);
////contains重複數字辨別法 if判斷法
