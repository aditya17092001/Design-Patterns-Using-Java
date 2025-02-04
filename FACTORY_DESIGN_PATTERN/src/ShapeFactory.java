public class ShapeFactory {
	public Shape getShape(String input) {
		if(input.equals("CIRCLE")) {
			return new Circle();
		} else if(input.equals("TRIANGLE")) {
			return new Triangle();
		} else if(input.equals("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
