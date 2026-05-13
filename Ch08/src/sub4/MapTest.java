package sub4;

import java.util.*;

/*
 * 
 * 날짜 : 2026/05/13
 * 이름 : 오수현
 * 내용 : Java 컬렉션 Map 실습
 * 
 */
public class MapTest {
	public static void main(String[] args) {
		// map 생성
		Map<Character, String> map = new HashMap<>();
		
		// map 데이터 추가
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// map 크기
		System.out.println("map 크기 : " + map.size());
		
		// map 데이터 참조
		System.out.println("map key A : " + map.get('A'));
		System.out.println("map key B : " + map.get('B'));
		System.out.println("map key C : " + map.get('C'));
		
		// map 반복문
		for(char k : map.keySet()) { // map의 keySet() 메서드로 key를 Set 변환
			System.out.println(k + " : " + map.get(k));
		}
		
		// -------------------------
		// map과 list 응용 실습
		// -------------------------		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("일본", 2000));
		m1.put(103, new Apple("중국", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("인도", 1000));
		
		List<Map<Integer, Apple>> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		for(int i=0;i<list.size();i++) {
			list.get(i).get((i+1)*100+i+1).show(); // 메서드 체이닝
		}
		
		// -------------------------
		// Properties 실습
		// -------------------------
		
		Properties prop = new Properties(); // Properties는 Key, Value가 모두 String인 자료구조
		prop.put("A", "Apple");
		prop.put("B", "Banana");
		prop.put("C", "Cherry");
		prop.setProperty("D", "Durian");
		
		System.out.println("prop : " + prop);
		System.out.println("prop A값 : " + prop.getProperty("A"));
		System.out.println("prop B값 : " + prop.getProperty("B"));
		System.out.println("prop C값 : " + prop.getProperty("C"));
		System.out.println("prop D값 : " + prop.getProperty("D"));
	}
}
