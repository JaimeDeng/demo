package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0306_practice {
	public static void main(String[] args) {
		
		Person A = new Person("7414" , "wow" , 20);
		System.out.printf("名字:%s , ID:%s , 年齡:%d%n" , A.getName() , A.getId() , A.getAge());
		
		Person B = new Person("9487" , "lol" , 22 , "A區B里C路87號");
		System.out.printf("名字:%s , ID:%s , 年齡:%d , 地址:%s%n" , B.getName() , B.getId() , B.getAge() , B.getAddress());
		
		 
	}
}