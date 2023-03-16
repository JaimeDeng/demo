package practice;

public class Hometown {
	
	private String city;
	private String state;
	private String country;
	private String street;
	private int Num;
	
	//constructor
	public Hometown() {

	}
	
	public Hometown(String city, String state, String country, String street, int num) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.street = street;
		Num = num;
	}

	//getter
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getStreet() {
		return street;
	}

	public int getNum() {
		return Num;
	}


	
	
	
	

}
