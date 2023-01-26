/**
 * 
 */

/**
 * @author Aaron Weedman
 *
 */
public class Circle {
	private int radius;
	
	public Circle() {
		radius = 0;
	}
	
	public Circle(int r) {
		radius = r;
	}
		public int getRadius() {
			return radius;	
		}
		
		public void setRadius(int radius) {
			this.radius=radius;
	}
		
		public double getArea() {
			return radius * radius * Math.PI;
		}
	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub


}
