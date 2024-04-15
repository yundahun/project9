package abstractex;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Car2> list = new ArrayList<Car2>();
		
		list.add(new Bus()); // 버스 객체 추가
		list.add(new AutoCar()); // 오토카 객체 추가
		
		for (int i = 0; i < list.size(); i++) {
			Car2 car = list.get(i); // 리스트 안에 저장된 요소 꺼내기
			
			car.run();
			car.refuel();
			
			if (car instanceof Bus) { // 실제 인스턴스의 타입 확인
				Bus bus = (Bus) car; // 다운캐스팅
				bus.takePassenger(); // 버스가 가지고 있는 메소드 호출
			} else if (car instanceof AutoCar) {
				AutoCar autoCar = (AutoCar) car;
				autoCar.load(); // 오토카가 가지고 있는 메소드 호출
			}
			
		}
	}

}
