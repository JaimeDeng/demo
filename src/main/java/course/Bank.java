package course;

public class Bank {
	
	String name;
	private int balance = 0;
	private int password;
	boolean login;
	
	public void setPassword(int password) {
		this.password = password;
	}
	public Bank(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void getPerBalance() {
		System.out.println(this.name + "目前存款餘額" + this.balance);
	}
	
	public void login(int password) {
		if(password == this.password) {
			System.out.println("登入成功!");
			login = true;
		}else {
			System.out.println("密碼錯誤!");
		}
	}
	
	public void save(int save) {
		if(login) {
			this.balance += save;		
		}else {
			System.out.println("你尚未登入喔");
		}
	}

}
