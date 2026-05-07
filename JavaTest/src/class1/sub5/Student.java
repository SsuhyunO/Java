package class1.sub5;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		subjects[subjectCount] = subject;
		subjects[subjectCount++].addStudent(this);
		System.out.printf("%s - %s 과목 신청완료\n", name, subject.getSubName());
	}
	
	public void setScore(Subject subject, int score) {
		for(int i=0;i<subjectCount;i++) {
			if((subjects[i].getSubName()).equals(subject.getSubName())) { 
				scores[i] = score;
				System.out.printf("%s - %s 점수 입력완료\n", name, subjects[i].getSubName());
			}
		}
	}
	
	public void printStudentInfo() {
		System.out.println("학생명 : " + name);
		System.out.println("아이디 : " + studentId);
		System.out.println("성적");
		for(int i=0;i<subjectCount;i++) {
			if(scores[i] == 0) continue;
			else System.out.printf(" - %s:%d\n", subjects[i].getSubName(), scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}
}
