package abstractex;

public class Quiz1 {

	public static void main(String[] args) {
		
		
		// 변수의 자료형으로 Car와 Sonata를 사용할 수 있다.(Avante도 마찬가지)
		Sonata sonata = new Sonata();
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
		
		Avante avante = new Avante();
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
	}

}

abstract class Car { // 추상클래스 지정
	
	// 추상 메소드
	public abstract void start();
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void turnOff();
}

class Avante extends Car {

	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다");
	}
}

class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다");
	}
}
