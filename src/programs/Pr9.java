package programs;

public class Pr9 {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Pr9 e = new Pr9();
		e.setAge(10);
		e.setName("faiz");
		System.out.println(e.getAge());
		System.out.println(e.getName());
	}
}
