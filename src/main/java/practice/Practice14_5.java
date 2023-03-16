package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice14_5 {
	public static void main(String[] args) {
		
		//登入資料: id , age , gender , salary , city , state , country , street , Num
		Hometown samHometown = new Hometown("Tainan" , "Tainan" , "Taiwan" , "中正路" , 87);
		Employee sam = new Employee(1001 , 20 , 'M' , 40000 , samHometown);
		sam.info();
		
		System.out.println();
		
		Hometown joeHometown = new Hometown("Taipei" , "Taipei" , "Taiwan" , "信義路" , 88);
		Employee joe = new Employee(1002 , 30 , 'M' , 50000 , joeHometown);
		joe.info();
		
		System.out.println();
		
		Hometown kellyHometown = new Hometown("Los Angeles" , "" , "California" , "Western Ave" , 66);
		Employee kelly = new Employee(1003 , 25 , 'F' , 87000 , samHometown);
		kelly.info();
		
	}
}