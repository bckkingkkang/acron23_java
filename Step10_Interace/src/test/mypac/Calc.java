package test.mypac;

// 계산기 인터페이스

// 추상 메소드를 1개만 만들도록 강제하는 역할 ( () -> { } 형태를 사용할 수 있도록 보장)
@FunctionalInterface

public interface Calc {

	// 메소드로 두 개의 실수를 전달받아서 어떤 연산을 수행하고 결과 값을 리턴해주는 메소드
	// 어떤 연산을 할지는 개발자가 알아서 정하기
	public double execute(double num1, double num2);
}
