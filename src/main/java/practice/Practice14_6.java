package practice;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Practice14_6 {
	public static void main(String[] args) {
		
		//Sentra繼承了Car又取用了Engine的method 此方法稱為組合 Composition
		Sentra sentra = new Sentra();
		sentra.setBrand("Nissan");
		sentra.setColor("black");
		sentra.setMaxSpeed(230);
		sentra.setYear(2087);
		sentra.info();
		System.out.println();
		sentra.sentraShow();
		
	}
}