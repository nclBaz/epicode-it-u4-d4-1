package entities;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}

	public void meow() {
		System.out.println("MIAO!");
	}

	@Override
	public void sayHello() {
		System.out.println("Ciao sono un gatto!");
	}

}
