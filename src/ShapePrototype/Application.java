package ShapePrototype;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	List<Shape> shapes=new ArrayList<Shape>();
	
	public Application(){
		Circle circle = new Circle();
		
		circle.x = 10;
		circle.y = 10;
		circle.radius = 20;
		shapes.add(circle);
		
		Circle anotherCircle = circle.clone();
		shapes.add(anotherCircle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		shapes.add(rectangle);
		
	}
	
	public void businessLogic(){
		
		List shapesCopy = new ArrayList();
		
		for(Shape s : shapes){
			shapesCopy.add(s.clone());
		}
	}
	
}
