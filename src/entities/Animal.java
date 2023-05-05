package entities;

public class Animal {
	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void walk() {
		System.out.println("Sto camminando!");
	}

	public void sayHello() {
		System.out.println("Ciao sono un animale!");
	}
}
