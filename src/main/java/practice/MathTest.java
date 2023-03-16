package practice;

public class MathTest extends MyMathAbstract {

	//全部的abstract method通通都必須要override
	@Override
	int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	int mns(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	int mul(int n1, int n2) {
		return n1 * n2;
	}

	@Override
	int div(int n1, int n2) {
		return n1 / n2;
	}

}
