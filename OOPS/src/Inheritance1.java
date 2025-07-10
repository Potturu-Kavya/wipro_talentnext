class Animal{
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
		
	}
}
class Bird extends Animal{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Bird is eating");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Bird is sleeping");
	}

	public void fly() {
		System.out.println("Bird is flying");
		
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();

	}

}
