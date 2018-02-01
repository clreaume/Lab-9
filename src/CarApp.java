/*
 * Cara Reaume
 * 
 * This program accepts data about n-number of cars, 
 * creates an object of class Car for each car which are
 * stored in an ArrayList, stores the data inputted
 * in instance variables, and then regurgitates
 * it all back to the user. It also makes use of the
 * Validator class.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		ArrayList<Car> carList = new ArrayList<Car>(); //creating ArrayList
		
		int numCars = Validator.getInt(input, "How many cars would you like to enter? ", 1);
		
		for (int i = 0 ; i < numCars; ++i) { //iterating though each car
			System.out.printf("For car #%d", i+1);
			String mk = Validator.getString(input, " enter the make: ");
			
			System.out.printf("For car #%d", i+1);
			String mod = Validator.getString(input, " enter the model: ");
			
			System.out.printf("For car #%d", i+1);
			int yr = Validator.getInt(input, " enter the year: ", 1808, 2020);
			
			System.out.printf("For car #%d", i+1);
			double pri = Validator.getDouble(input, " enter the price: ", 0.0);
			
			carList.add(new Car(mk, mod, yr, pri)); //adding "nameless" instances to carList
		}
		
		//to print using printf	and individual instance variables
		for (int i = 0 ; i < carList.size(); ++i) { //printing using printf
			System.out.printf("Car #%d: ", i+1);
			System.out.println();
			System.out.printf("Make: %-15s \t Model: %-15s \t Year: %-15d \t Price: $%-15.2f ", carList.get(i).getMake(), carList.get(i).getModel(), carList.get(i).getYear(), carList.get(i).getPrice());
			System.out.println();
		}
		//to print simply by accessing .toString
//		for (int i = 0 ; i < carList.size(); ++i) { 
//			System.out.println(carList.get(i));
//		}
		
	input.close();	
	}

}
