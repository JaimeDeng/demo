package course;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassPractice {
	public static void main(String[] args) {
		
		//使用static method getPersonId()直接讀取id預設值
		System.out.println("id的預設值");
		Person.getPersonId();	//static變數可直接呼叫class的static method
		System.out.println();
		
		//使用建構子
		Person no_1 = new Person("00087" ," john");		//建立object時同時設置
		System.out.println("設定的id與name");
		System.out.println(no_1.id  + " " + no_1.name);
		System.out.println();
		
		//使用Setter & Getter 設置.讀取private變數 : Encapsulation 封裝
		System.out.println("以setter設置的age");
		no_1.setAge(26);
		System.out.println(no_1.getAge());
				
	}
}