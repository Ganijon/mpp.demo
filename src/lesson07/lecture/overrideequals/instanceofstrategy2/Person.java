package lesson07.lecture.overrideequals.instanceofstrategy2;

/** 
 * INCORRECT: Person and PersonWithJob both use instanceof strategy
 * to override equals. Bad: Asymmetric equals:
 *   - Person equals PersonWithJob but
 *   - PersonWithJob not equals Person
 */
public class Person {

	protected String name;
	Person(String n) {
		name = n;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}
	public static void main(String[] args) {
		Person p1 = new Person("Joe");
		Person p2 = new PersonWithJob("Joe", 20000);
		//As Persons, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
		boolean b = p2 instanceof Person;
		boolean b1 = p1 instanceof PersonWithJob;
		System.out.println("p2 instance of Person ? " + b);
		System.out.println("p1 instance of PersonWithJob ? " + b1);
	}

}
