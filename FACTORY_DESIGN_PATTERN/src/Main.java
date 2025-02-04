public class Main {
	public static void main(String args[]) {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape("CIRCLE");
		Shape triangle = factory.getShape("TRIANGLE");
		
		circle.draw();
		triangle.draw();
	}
}
