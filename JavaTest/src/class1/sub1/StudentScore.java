package class1.sub1;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, Double score){
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double score) {
		if(score >= 0.0 && score <= 100.0) {
			this.score = score;
			System.out.println("점수 수정 완료");
		}
		else System.out.println("잘못된 점수 입력");
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("학색 이름 : " + studentName);
		System.out.println("학색 ID : " + studentId);
		System.out.println("과목 : " + subject);
		System.out.println("점수 : " + score);
	}
}
