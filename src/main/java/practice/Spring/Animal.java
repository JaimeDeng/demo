package practice.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Animal implements Active {

	@Override
	public void fly() {
		System.out.println("鳥正在飛");
	}

}
