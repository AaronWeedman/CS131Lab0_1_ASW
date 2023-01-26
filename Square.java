/**
 * 
 */

/**
 * @author Aaron Weedman
 *
 */
public class Square {
	
	private int side;
	public Square() {
		side=0;
	}
	public Square(int n) {
		side =n; //?
	}
	
	public int getSide() {
		return side;
	}
	
	public void setSide(int side) {
		this.side = side;
	}
	
	public double getArea() {
		return side * side;	
	}

	/**
	 * @param args
	 */

}
