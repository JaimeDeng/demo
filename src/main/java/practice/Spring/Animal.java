package practice.Spring;

import org.springframework.stereotype.Service;

@Service
public class Animal implements Active {
	
	@Override
	public void fly(String name, int age) {
		System.out.println(name + "今年" + age + "歲 , 正在飛");
	}

}
