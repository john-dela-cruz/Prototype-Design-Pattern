package ShapePrototype;

public class Rectangle extends Shape{
	
	int width;
	int height;
	
	public Rectangle(){
		
	}
	
	public Rectangle(int width, int height){
		
		super();
		this.width = width;
		this.height = height;
	}
	
	public Rectangle clone(){
		
		return new Rectangle(width,height);
	}
}
