package W3School;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

//Objects Superclass
public class Superclass {
	
	protected int Speed = 200;
	protected String Color = "Red";		//先給予class屬性
	protected String Type = "CBR-300R";
	
	//InnerClass		Class內可以再包覆Class
	 private class InnerClass {		//若用private或protected宣告則不可被外部呼叫
		    int CC = 300;
		  }
	
	public static void main(String[] args) {
		
		Superclass outer = new Superclass();		//若要呼叫InnerClass,必須先呼叫OuterClass
		Superclass.InnerClass inner = outer.new InnerClass();		//呼叫InnerClass
		System.out.printf("顏色%s%nCC數%d" , outer.Color , inner.CC);
		
	}
}