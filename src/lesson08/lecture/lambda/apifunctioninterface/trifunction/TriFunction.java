package lesson08.lecture.lambda.apifunctioninterface.trifunction;

@FunctionalInterface
public interface TriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
