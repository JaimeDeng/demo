package practice;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aggregation {
	public static void main(String[] args) {
		
		Class_B objB = new Class_B();
		System.out.println(objB.getID());
		System.out.println(objB.getObjC().getAge());		//執行檔沒有new出class_c , 透過b的getter取c,再取值
		System.out.println(objB.getObjC().getName());		//透過class_b去get class_c的值
		System.out.println(objB.getObjC().getScore());
		
		System.out.println();
		
		Class_C objC = new Class_C();		//建立Class_C的物件objC , 並用new 空白建構子賦予Class_C的預設值
		Class_A objA = new Class_A(objC);		//在Class_A的建構子中添加有預設值的Class_C進去
		System.out.println(objA.getAddress());
		System.out.println(objA.getObjC().getAge());
		System.out.println(objC.getName());		//在執行檔中new出class_c了 , 因此也可以直接用c的getter取值
		System.out.println(objC.getScore());

		System.out.println();
		
//		Class_D objD = new Class_D();
//		System.out.println(objD.getNum());
//		System.out.println(objD.getObjC().getAge());
//		System.out.println(objD.getObjC().getName());
//		System.out.println(objD.getObjC().getScore());
		
		System.out.println();
		objA.info();
		System.out.println();
		objB.info();
		System.out.println();
//		objD.info();
		
	}
}