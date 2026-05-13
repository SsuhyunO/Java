package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 * 날짜 : 2026/05/13
 * 이름 : 오수현
 * 내용 : Java 버퍼 입출력 실습
 * 
 */
public class BufferIOTest {
	public static void main(String[] args) {
		String source = "C:\\Users\\GGG\\Desktop\\universe.mp4";
		String target = "C:\\Users\\GGG\\Desktop\\result.mp4";
		
		// 스트림 생성
		try {
			FileInputStream fis = new FileInputStream(source);		// 입력 스트림
			FileOutputStream fos = new FileOutputStream(target); 	// 출력 스트림
			
			// 보조 스트림(Buffer)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			while(true) {
				int data = bis.read();
				
				if(data == -1) { // 파일 읽을 내용이 없으면
					break;
				}
				
				// 출력 테스트
				// System.out.println((char)data);
				
				// 파일 쓰기
				bos.write(data);
			}
			
			// 스트림 연결 해제
			bis.close();
			
			bos.flush(); // 버퍼 비워내기
			bos.close();
			
			fis.close();
			fos.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
}
