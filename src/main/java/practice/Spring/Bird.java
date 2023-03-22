package practice.Spring;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.SpringDemoApplication;

import java.util.TreeMap;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@SpringBootApplication
public class Bird {
	
	@Autowired
	private Active active;
	
	public static void main(String[] args) {
		SpringApplication.run(Bird.class, args);
		Bird bird = new Bird();

	}
}