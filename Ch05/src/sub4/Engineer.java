package sub4;

public class Engineer extends Person{
	
	private String field;
	
	public Engineer(String name, int age, String field) {
		super(name, age);
		this.field = field;
	}

	public void work() {
		System.out.printf("\n제 이름은 [%s]이고 나이는 [%d]입니다.\n저는 [%s] 엔지니어입니다.", name, age, field);
	}
	
}
