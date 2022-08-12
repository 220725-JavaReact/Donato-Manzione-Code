
enum Transport {
	CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); // notice the initialization values
	// each constant is an instance of the enum
	// when you're declaring a constant, it's almost like
	// you're instantiating the enum, so if you have
	// only one constructor and it is is parameterized, you must
	// pass a value to the constant

	private int speed; // typical speed of each transport

	// Constructor
	Transport(int s) {
		speed = s;
	}

	// you can add instance methods
	// these will be available to each constant
	int getSpeed() {
		return speed;
	}

}

public class EnumDemo {
	
	public static void main(String[] args) {
		for(Transport tp : Transport.values()) {
			
		}
	}
	
}
