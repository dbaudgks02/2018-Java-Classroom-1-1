package _04생성자오버로딩2;

public class Student {
	String name = "미정";
	int age = -1;

	Student() {
		this("모름", -1);
	}

	Student(String name) {
		this(name, -1);
	}

	Student(int age) {
		String name = "모름";
		this(name, age);
	}

	Student(String sname, int sage) {
		this.name = name;
		this.age = age;
	}

	void print() {
		System.out.println(name + "," + age);
	}
}
