package finalex;

public class Ex3 {

	public static void main(String[] args) {

	}

}

class Parents {
	
	final void method1() { // 재정의 불가
	}
	
	void method2() {
	}
}

class Child extends Parents {

	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}
	
	
}