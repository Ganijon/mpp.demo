package lesson05.lab.prob1;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("  displaying");
		
	}
}
