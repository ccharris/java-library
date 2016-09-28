package _11_Class_Properties;

public class BasicObjects {

	public static void main(String[] args) {
		//Car calls the class, paulsDreamCar is the new object or instance, then new, then call the class Car. instantiate this object.
		Car paulsDreamCar = new Car();
		paulsDreamCar.make = "Tesla";
		paulsDreamCar.model = "Model 3";
		paulsDreamCar.color = "black";
		paulsDreamCar.isFast = true;
		paulsDreamCar.isElectric = true;
		paulsDreamCar.milesPerCharge = 300.00;
		
		
		//Make another car that is your dream car and add 8 properties.
		
		Car myDreamCar = new Car();
		myDreamCar.make = "Bugatti";
		myDreamCar.model = "Chiron";
		myDreamCar.color = "blue";
		myDreamCar.isFast = true;
		myDreamCar.horsepower = 1500;
		myDreamCar.leatherSeats = true;
		myDreamCar.isPopularAmongstMillenials = true;
		myDreamCar.mpgHighway = 14;
		System.out.println(myDreamCar.make + " " + myDreamCar.model + " " + myDreamCar.color + " " + myDreamCar.horsepower);
		
		
		
		

	}

}
