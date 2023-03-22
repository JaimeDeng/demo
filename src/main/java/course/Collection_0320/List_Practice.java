package course.Collection_0320;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class List_Practice {
	public static void main(String[] args) {

		List <String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		//使用iterator物件進行遍歷
		Iterator <String> itr = list.iterator();	//設定itr物件為list的迭代器
		while(itr.hasNext()) {		//itr的方法 hasNext來判斷list是否有下個內容
			System.out.print(itr.next());	//讀取list下個內容
		}
	}
}