/**
 * 
 */

/**
 * @author Aaron Weedman
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Square square = new Square(2);
		System.out.println("Square area: " + square.getArea());
		
		Circle circle = new Circle(1);
		System.out.println("Circle area: " + circle.getArea());
	}

}
