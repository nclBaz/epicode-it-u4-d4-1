package entities;

public class Dog extends Animal {

	String color;

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String c) {
		super(name, age);
		this.color = c;
	}


	public void bark() {
		System.out.println("BAU!");
	}

	@Override
	public void sayHello() {
		System.out.println("Ciao sono un cane!");
	}

	@Override
	public void walk() {
		System.out.println("Sto camminando");
	}

	public void walk(String numPassi) {
	}

}
