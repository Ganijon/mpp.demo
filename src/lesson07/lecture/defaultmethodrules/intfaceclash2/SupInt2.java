package lesson07.lecture.defaultmethodrules.intfaceclash2;

public interface SupInt2 extends Top {
	default void myMethod(int x) {
		System.out.print(x);
	}
}
