package sub6;
/*
 * 
 * 날짜 : 2026/05/06 
 * 이름 : 오수현
 * 내용 : Java 다형성 실습
 * 
 */
public class PolyTest {
	public static void main(String[] args) {
		// 다형성을 활용한 객체 생성
		Animal tiger = new Tiger(); // 참조변수(객체)의 타입을 부모 클래스로 선언 --> 업캐스팅, 다형성 코드 표현
		Animal eagle = new Eagle();
		Animal shark = new Shark();
		
		tiger.move();
		eagle.move();
		shark.move();
		
		tiger.hunt();
		eagle.hunt();
		shark.hunt();
		
		Pet dog = new Dog();
		Pet cat = new Cat();
		printSound(dog);
		printSound(cat);		
	}
	
	public static void printSound(Pet p) {
		p.makeSound();
	}
}
