package course;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0309 {
	public static void main(String[] args) {
		
		//Override & Polymorphism
		
		Animal animal = new Animal("animal");
		animal.eat();
		animal.move();
		
		System.out.println();
		
		Bird bird = new Bird("GG");
		Bird birdB = new Bird("87");
		bird.fly();
		bird.birdMove(birdB);
		bird.eat();		//Class Bird的eat()有override的eat
		
		System.out.println();
		
		Cat cat = new Cat("meow");
		cat.jump();
		cat.move();		//overide
		cat.eat();		//Class Cat的eat()有override的eat跟super的eat
		
		System.out.println();
		System.out.println("======向上轉型======");
		
		//雖然是Superclass的物件但是參照指向Subclass
		Animal birdAnim = new Bird("GGAni");
		Animal catAnim = new Cat("meowAni");
		animal.animalMove(birdAnim);	//使用Animal的method但結果是指向Bird
		animal.animalMove(catAnim);		//使用Animal的method但結果是指向Cat
//		birdAnim.birdMove(birdAnim);	//Animal類別內沒有birdMove , 所以無效
//		birdAnim.fly();		//同上 , fly()是Bird類別的 , 無法使用
		
		System.out.println();
		System.out.println("======向下轉型======");
		
		//當向上轉型後的物件 , 無法使用自己本質的method , 所以必須向下轉型才能使用
		if(birdAnim instanceof Bird) {		//確認Animal的物件birdAnim是指向Bird才做向下轉型
		Bird birdDown  = (Bird) birdAnim;		//把birdAnim強制轉型為Bird
		birdDown.fly();		//此時才能做Bird類別的method
		animal.animalMove(birdDown);		//一樣指向Subclass
		}
	}
}