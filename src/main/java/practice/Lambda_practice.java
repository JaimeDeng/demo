package practice;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Lambda_practice {
	public static void main(String[] args) {
		
		System.out.println("=====Lambda foreach=====");
		
		var list = new ArrayList<String>(Arrays.asList("安安" , "你好" , "掰掰"));		
		list.forEach(info->System.out.println(info));
		//可以將method寫入在Consumer類別的object裡面 , 來使用Lambda foreach
		Consumer<String> foreach = n->System.out.println(n);
		list.forEach(foreach);
		System.out.println();
		System.out.println();
		
		System.out.println("=====Lambda物件=====");
		
		//將Lambda表達式分別在不同obj定義
		LambdaTest add = (x , y) -> (x + y);
		LambdaTest mns = (x , y) -> (x - y);
		LambdaTest mul = (x , y) -> (x * y);
		LambdaTest div = (x , y) -> (x / y);
		
		System.out.println(add.calcu(10 , 2));
		System.out.println(mns.calcu(10 , 2));
		System.out.println(mul.calcu(10 , 2));
		System.out.println(div.calcu(10 , 2));
		
	}
}