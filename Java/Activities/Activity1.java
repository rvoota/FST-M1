package activities;

public class Activity1 {

	public static void main(String[] args) {
		
		Car myCar = new Car("blue","auto",2025);
		myCar.displayCharacteristics();
		myCar.accelerate();
		myCar.brake();
	}
	
}
