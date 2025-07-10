class Fruit{
	String name;
    String taste;
	String size;
	
	Fruit(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	
	public void eat() {
		System.out.println(name);
		System.out.println(taste);
	
	}
}
class Apple extends Fruit{

	
    private static final String Apple = null;

	public Apple() {
    	super(Apple,Sweet);
    }

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		
	}
	
}
class Orange extends Fruit{


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
}
public class Overriding1 {
	public static void main(String[] args) {
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
		
	}

}
