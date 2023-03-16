package practice.InterfacePractice17_4;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Display extends Fly {
	public static void main(String[] args) {
		
		Fly fly = new Fly();
		fly.birdFly();
		fly.airplaneFly();
		fly.meFly();
		
	}
}