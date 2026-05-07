package class1.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student student) {
		students[studentCount++] = student;
	}
	
	public void printSubjectInfo() {
		System.out.println("과목명 : " + subName);
		System.out.print("수강생 : ");
		for(int i=0;i<studentCount;i++) {
			if (i<studentCount - 1) {
				System.out.print(students[i].getName() + ", ");
			}else if (i == studentCount - 1) System.out.println(students[i].getName());
		}
	}
	
	public String getSubName() {
		return subName;
	}
}
