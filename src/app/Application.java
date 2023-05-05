package app;

import entities.Student;

public class Application {

	public static void main(String[] args) {
		Student aldo = new Student("Aldo", "Baglio");

		aldo.setAge(-20);

		System.out.println(aldo.getAge());
	}

}
