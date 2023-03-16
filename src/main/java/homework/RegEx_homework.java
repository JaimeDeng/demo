package homework;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RegEx_homework {
	public static void main(String[] args) {
		
		//身份證字號檢查
		String str = "D148798787";	//大英+九碼
		String pattern = "[A-Z&&[^ABDEFH]][12]\\d{8}";
		System.out.println("是否為非六都身分證字號: " + str.matches(pattern));
		
	}
}