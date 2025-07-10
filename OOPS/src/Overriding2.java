class Shape{
	public void draw() {
		System.out.println("Drawing image");
	}
	public void erase() {
		System.out.println("Erasing image");
	}
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erasing circle");
	}
	
}
class Triangle extends Shape {
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing triangle");
	}
	@Override
	public void erase() {
		// TODO Auto-generated method stub
		System.out.println("Erasing triangle");
	}
	
	
}
class Square extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing square");
	}

	@Override
	public void erase() {
		System.out.println("Erasing square");
	}
	
}

public class Overriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c=new Circle();
		Shape t=new Triangle();
		Shape s=new Square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
