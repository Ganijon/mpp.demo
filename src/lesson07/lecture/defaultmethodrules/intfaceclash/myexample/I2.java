package lesson07.lecture.defaultmethodrules.intfaceclash.myexample;

public interface I2 {
	default void myMethod(){
		System.out.println("Default");
	}
}
