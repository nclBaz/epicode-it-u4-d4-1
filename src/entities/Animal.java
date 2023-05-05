package entities;

public abstract class Animal implements Walker {
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


	public abstract void sayHello();
	// I metodi delle classi astratte non hanno un body
	// Servono per obbligare chi eredita ad implementarlo

	public void getInfo() {
		System.out.println("Il mio nome è:" + this.name + ", la mia età è:" + this.age);
	}
}
