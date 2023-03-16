package W3School;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

//Objects Inheritance 繼承
public class Inheritance extends Superclass {		// extends 繼承parent class (Superclass , 自己則是Subclass)
	
	String Color = "black";
	String Name = "Honda";		//自有的屬性
	int Quantity = 20;
	
	public static void main(String[] args) {
		
		Inheritance A = new Inheritance();
		System.out.printf("品名%s%n顏色%s%n庫存%d%n" , A.Name , A.Color , A.Quantity);		//自有的屬性
		System.out.printf("速度%s%n型號%s%n" , A.Speed , A.Type);		//繼承來的屬性與值

	}
}