package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoTestApplication_0303 {
	public static void main(String[] args) {
		
		//Create object
		Dog myDog = new Dog();		//新增物件為 Class : Dog 的物件
		Dog yourDog = new Dog();
		
		//Set attributes value
		myDog.setName("wow");
		myDog.setColor("white");
		myDog.setAge(3);
		yourDog.setName("wow");
		System.out.println(myDog.getName() == yourDog.getName());
		
		//Get attributes value
		System.out.println("我的狗名字是" + myDog.getName());
		System.out.println("我的狗顏色是" + myDog.getColor());
		System.out.println("我的狗" + myDog.getAge() + "歲");
		System.out.println("晶片植入:" + myDog.chip);
		System.out.println();
		
		//Methods
		System.out.println("我的狗在叫" );
		myDog.barking();
		System.out.println("我的狗睡著了");
		myDog.sleeping();
	}
}