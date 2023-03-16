package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Inheritance_Practice {
	public static void main(String[] args) {
		
		Dog lol = new Dog("lol");		//屬性name為繼承自animal , Animal的name為private , 使用其getter來獲取值
		Bird wow = new Bird("wow");
		System.out.println(lol.getName());
		lol.barking();
		lol.sleep();
		lol.eat();
		wow.fly();
		wow.sleep();
		wow.eat();
		
		System.out.println("============");

		//練習 建立Superclass"Father" 給"Son" "Daughter"繼承 各別執行其method
		Father father = new Father("Father");
		father.walk();
		
		Son son = new Son("Son");
		son.walk();
		son.playball();
		
		Daughter daughter = new Daughter("Daughter");
		daughter.walk();
		daughter.shopping(); 
		
		System.out.println("============");
		
		Animal x_x = new Dog();		//多形:向上轉型 呼叫Superclass調用Subclass的method , *屬性不適用!!
		System.out.println(x_x.name);		//屬性會是Superclass的! 用getter才會是Subclass的(因為getter是method)
		x_x.sleep();
		x_x.eat();
		
		Dog o_o = (Dog) x_x;		//多形:向下轉型 
		o_o.sleep();
		o_o.eat();
		
	}
}