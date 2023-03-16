package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0303_2 {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		Dog yourDog = new Dog();
		
		//物件參照位址而非原始值
		System.out.println("==============");
		
		System.out.println(myDog);
		System.out.println(yourDog);
		System.out.println(myDog == yourDog);
		
		System.out.println("=======new str=======");
		
		String strA = new String ("CC");	//strA建立了一個CC的記憶體區塊
		String strB = new String ("CC");	//strB也建立了一個CC的記憶體區塊	兩個指向不同區塊
		String strC = new String ("cc");
		System.out.println(strA == strB);
		System.out.println(strA.equals(strC));		//等同於==,但只認內容值,無視記憶體位置
		System.out.println(strA.equalsIgnoreCase(strC));		//無視upper or lower Case及記憶體,只認字符的==
		strA = strB;	//指向相同記憶區塊
		System.out.println(strA == strB);
		
		System.out.println("=======str=======");
		
		String strAA = "CC";		//strAA建立了一個CC的記憶體區塊
		String strBB = "CC";		//strBB與AA共用同一個CC的記憶體區塊
		System.out.println(strAA == strBB);
		
		System.out.println("=======new int=======");
		
		Integer x = new Integer(100);
		Integer y = new Integer(100);
		System.out.println(x == y);
		x = y;
		System.out.println(x == y);
		
		System.out.println("=======int=======");
		
		Integer xx = 100;
		Integer yy = 100;
		System.out.println(xx == yy);
		
		System.out.println("=======name=======");
		
		System.out.println(myDog.name);
		System.out.println(yourDog.name);
		System.out.println(myDog.name == yourDog.name);
		
		System.out.println("=======get name=======");
		
		myDog.setName("wow");
		yourDog.setName("wow");
		System.out.println(myDog.getName() == yourDog.getName());
		
		System.out.println("==============");
	}
}