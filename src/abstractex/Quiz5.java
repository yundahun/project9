package abstractex;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Animal2> list = new ArrayList<Animal2>();
		
		list.add(new Human());
		list.add(new Tiger());
		
		for (int i = 0; i < list.size(); i++) {
			Animal2 animal = list.get(i);
			
			animal.sleep();
			animal.move();
			
			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBook();
				
				System.out.println();
				
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			}
		}
	}

}
