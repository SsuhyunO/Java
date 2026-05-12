package sub3;

import java.util.*;

/*
 * 
 * 날짜 : 2026/05/12
 * 이름 : 오수현
 * 내용 : Java 컬렉션 Set 실습
 * 
 */
public class SetTest {
	public static void main(String[] args) {
		// 집합(Set) 생성
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(3);
		set.add(3);
		
		System.out.println(set);
		
		// 집합(Set)에 대한 반복자 생성
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) { // 반복자로 데이터가 없을 때까지 반복 수행
			System.out.println(it.next()); // 데이터를 출력하고 다음 데이터 탐색
		}
		
		// 반복문 처리
		for(int num:set) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		// ------------------------------------------------
		// 집합 연산
		// ------------------------------------------------
		Set<String> setA = new HashSet<>(Arrays.asList("서울", "대전", "대구", "부산", "광주"));
		Set<String> setB = new HashSet<>(Arrays.asList("인천", "부산", "울산", "수원", "서울"));
		
		
		// 합집합
		Set<String> union = new HashSet<>(setA);
		union.addAll(setB);

		System.out.println("합집합 : " + union);
		
		// 교집합
		Set<String> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);

		System.out.println("교집합 : " + intersection);
		
		
		// 차집합
		Set<String> minus = new HashSet<>(setA);
		minus.removeAll(setB);

		System.out.println("차집합 : " + minus);
		
		// ------------------------------------------------
		// TreeSet 실습
		// ------------------------------------------------
		
		Set<Integer> scores = new TreeSet<>();
		
		scores.add(68);
		scores.add(56);
		scores.add(89);
		scores.add(92);
		scores.add(70);
		scores.add(70);
		
		System.out.println(scores);
	}
}
