package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class NestedClasses {
	public static void main(String[] args) {
		
		System.out.println("======一般內部類別=====");
		OuterClass outer = new OuterClass();
		outer.displayInfo();
		//外部Class有內部Class的private , 因此可以在外部Class的method呼叫內部Class屬性.方法
		
		OuterClass.InnerClass inner =  outer.new InnerClass();	//外部Class呼叫內部Class
//		inner.info();		//內部Class屬性跟方法是private,不可取用
		
		System.out.println("======方法內部類別=====");
		
		outer.college();
		
		System.out.println("======匿名內部類別=====");
		
		//只使用一次的Class , 沒有Class名稱 , 用於override原本的內容
		OuterClass anonymousInner = new OuterClass() {	//建立OuterClass時用大括號包覆匿名內部Class
			@Override
			public void displayInfo() {
				System.out.println("額");
			}
		};		//注意要加";"
		
		anonymousInner.displayInfo();
		
	}
}