package programs;

public class Encapsule {
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
		Encapsule e = new Encapsule();
		e.setAge(10);
		e.setName("faiz");
		System.out.println(e.getAge());
		System.out.println(e.getName());
	}
}
