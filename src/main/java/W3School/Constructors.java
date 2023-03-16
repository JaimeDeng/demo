package W3School;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

//Objects Constructors 建構子
public class Constructors {
	
	protected int Speed;
	protected String Color;		//先給予class屬性
	protected String Type;
	
	//Eclipse右鍵Source即可自動建立
	public Constructors(int addSpeed , String addColor , String addType) {		//建立該class的建構子
		Speed = addSpeed;
		Color = addColor;		//()內給予變數並排序,()內輸入的"實參"賦予給class的"形參"
		Type = addType;
	}
	
	public static void main(String[] args) {
		
		//如此一來即可達到宣告物件同時宣告參數值
		Constructors carA = new Constructors(200 , "black" , "C");
		System.out.printf("這台車車的顏色為%s%n型號為%s%n最高時速%d" , carA.Color , carA.Type , carA.Speed);
	}
}