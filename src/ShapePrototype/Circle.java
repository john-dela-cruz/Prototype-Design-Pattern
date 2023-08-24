package ShapePrototype;

public class Circle extends Shape{
	
	int radius;
	
	public Circle(){
		
	}
	
	public Circle(int radius){
		
		super();
		this.radius = radius;
		
	}
	
	public Circle clone(){
		
		return new Circle(radius);
		
	}
}
