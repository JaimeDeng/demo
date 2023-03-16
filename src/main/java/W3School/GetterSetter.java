package W3School;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

//objects Encapsulation (封裝)
public class GetterSetter {
	
	private String color;
	private String name;		//設為private之後,該參數不可直接寫入或讀取
	private int quantity;		//必須透過methods來讀寫 , 該method稱為setter/setter
	
	//getter/setter 按右鍵source就可以generate,不需自己打
	
	//setter 寫入內容
	public void setName( String newName ){		//當呼叫setName()時()內輸入欲寫入的內容
		this.name = newName;		//()輸入的內容寫入該class的name
	}
	
	public void setColor( String newColor ){
		this.color = newColor;
	}
	
	public void setQuantity( int newQuantity ){		//注意變數種類的宣告
		this.quantity = newQuantity;
	}
	
	//getter 獲取內容
	public String getName( ){		//獲取內容須回傳值,不可用void,需對應該變數種類
		return name;		//呼叫getName()時 return name給getName
	}
	
	public String getColor( ){
		return color;
	}
	
	public int getQuantity( ){		//注意變數種類的宣告
		return quantity;
	}
	
	public static void main(String[] args) {
		
		GetterSetter A = new GetterSetter();		// 宣告A為新物件
		
		A.setName("John cena");		//使用setter寫入,注意輸入方式需對應變數種類
		A.setColor("pink");
		A.setQuantity(100);
		System.out.printf("商品名:%s%n商品顏色:%s%n庫存數量:%d%n" , A.getName() , A.getColor() , A.getQuantity());
		//使用getter獲取變數值,注意printf的變數取用符號有所分別
	}
}