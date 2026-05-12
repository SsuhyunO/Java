package sub2;

import java.util.*;

import sub1.Apple;
/*
 * 
 * 날짜 : 2026/05/12
 * 이름 : 오수현
 * 내용 : Java 컬렉션 List 실습
 * 
 */
public class ListTest {
	public static void main(String[] args) {
		// ------------------------------------
		// ArrayList 기본
		// ------------------------------------
		
		// 리스트 생성
		List<Integer> list = new ArrayList<>();
		
		// 데이터 추가(끝에 삽입)
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);

		// 데이터 삽입(index에 element 삽입)
		list.add(1, 6);		
		System.out.println(list);
		
		// 데이터 제거(index의 element 제거)
		list.remove(2);
		System.out.println(list);

		list.remove(3);
		System.out.println(list);

		// 데이터 출력
		System.out.println("list 1번 데이터 : " + list.getFirst());
		System.out.println("list 2번 데이터 : " + list.get(1));
		System.out.println("list 3번 데이터 : " + list.get(2));
		System.out.println("list 마지막 데이터 : " + list.getLast());

		// 리스트 길이
		System.out.println("list 크기 : " + list.size());
		
		// 리스트 반복문
		for(int num:list) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		// ------------------------------------
		// 문자열 리스트 기본
		// ------------------------------------
		List<String> names = new ArrayList<>();
		
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		System.out.println(names);
		
		names.add("정약용");
		System.out.println(names);
		
		names.add(4, "정도전");
		System.out.println(names);

		names.add(1, "비담");
		System.out.println(names);

		names.remove(3);
		System.out.println(names);

		names.add(3, "왕건");
		System.out.println(names);

		names.set(names.indexOf("정도전"), "세종대왕");
		System.out.println(names);
				
		// ------------------------------------
		// 객체 리스트 기본
		// ------------------------------------
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 5000);
		Apple a2 = new Apple("일본", 3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(new Apple("미국", 4000));
		
		System.out.println(apples);
		System.out.println(apples.get(0));
		
		// ------------------------------------
		// 링크드리스트(LinkedList) 기본
		// ------------------------------------
		List<String> linked = new LinkedList<>();
		
		linked.add("서울");
		linked.add("대전");
		linked.add("대구");
		linked.add("부산");
		linked.add("광주");
		System.out.println(linked);
		
		// 데이터 삽입
		linked.add(1, "인천");
		linked.addFirst("수원");
		linked.addLast("울산");
		System.out.println(linked);
	}
}
