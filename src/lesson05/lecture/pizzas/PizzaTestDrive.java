package lesson05.lecture.factorypattern.myexample.pizzas;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		Pizza cheese = SimplePizzaFactory.createPizza("cheese");
	    cheese.orderPizza();
	}
}
