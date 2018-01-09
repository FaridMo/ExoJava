package monPackage.com;

public class Point {

	private double x,y;
	
	public void initialize(double abs, double ord){
		x=abs;
		y=ord;
	}
	public static void main(String[] args) {

		Point t = new Point();
		t.initialize(23, 3);
		//System.out.println(t);
		System.out.println("x = "+t.x+" et y = "+t.y);
	}

}
