package lesson05.lab.prob1;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("  display");
		
	}

}
