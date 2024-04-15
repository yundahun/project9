package abstractex;

public class Ex1 {

	public static void main(String[] args) {

		// 에러 발생. 컴퓨터 클래스는 추상 클래스이기 때문에 (인스턴스 생성 못함)
//		Computer computer = new Computer();
		
		DeskTop desktop = new DeskTop();
		NoteBook notebook = new NoteBook();
		
		desktop.turnOn();
		desktop.turnOff();
		desktop.display();
		desktop.typing();
		
		notebook.turnOn();
		notebook.turnOff();
		notebook.display();
		notebook.typing();
	}

}

abstract class Computer {
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 컴퓨터마다 화면을 표시하는 방법이 다르니까 추상메소드로 선언
	public abstract void display();
	
	public abstract void typing();	
}

class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
}

class NoteBook extends Computer {

	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook Typing()");
	}
	
	
}