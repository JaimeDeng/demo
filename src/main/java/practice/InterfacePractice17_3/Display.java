package practice.InterfacePractice17_3;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Display {
	public static void main(String[] args) {
		
		Car toyota = new Car("toyota");
		
		System.out.println(toyota.getBrand());
		System.out.println(toyota.starting());
		System.out.println	(toyota.alarmOn());
		System.out.println(toyota.alarmOff());
		System.out.println(toyota.run());
		System.out.println(toyota.ending());
		System.out.println(Vehicle.rpmUp(3000));	//static method 直接呼叫
		
	}
}