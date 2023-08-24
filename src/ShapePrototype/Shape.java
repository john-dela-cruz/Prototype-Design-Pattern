package ShapePrototype;

public class Shape {
	int x;
	int y;
	String color;
	
	public Shape(){
		
	}
	
	public Shape(int x, int y, String color){
		
		this();
		this.x = x;
		this.y = y;
		this.color = color;
		
	}
	
	public Shape clone(){
		
		return new Shape(x,y,color);
	}
}
