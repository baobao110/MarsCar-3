public class TestCar {
	public static void main(String args[]) {

		MarsCar car = new MarsCar("���ǳ�7��",new Point(3,4));
		//car.move("w", "w", "w", "back", "back", "back", "back");
		//car.move("w", "w", "w", "back");
		car.move("w", "w", "w", "back", "show","w","w","back");

		// car = new MarsCar("���ǳ�6��", new Point(2, 3));
		// car.move("w", "d");

		// car = new MarsCar();
		// car.move("w");	
		
	}
}
