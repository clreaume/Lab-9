
public class Car {
	String make;
	String model;
	int year;
	double price;
	
	//default constructor
	Car(){
		make = "default";
		model = "default";
		year = 0000;
		price = 0.0;
	}
	
	//constructor that takes in values
	Car(String make, String model, int year, double price){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	//begin getters and setters
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//end getters and setters
	
	//toString override
	public String toString() {
		return "Make: " + make + "\t" + "Model: " + model + "\t" + "Year: " + year + "\tPrice: $" + price;
	
	}
		
}
