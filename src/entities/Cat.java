package entities;

public class Cat extends Animal implements Runner {

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

	@Override
	public void walk() {
		System.out.println("Ciao sono un gatto e sto camminando");

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}


}
