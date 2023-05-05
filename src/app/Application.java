package app;

import entities.Dog;
import entities.Student;

public class Application {

	public static void main(String[] args) {
		Student aldo = new Student("Aldo", "Baglio");

		aldo.setAge(-20);

		System.out.println(aldo.getAge());

		Dog fido = new Dog("Fido", 2);

		fido.walk();
		fido.bark();
		fido.sayHello();
//		Animal a = new Animal("sadsad", 123);
//		
//		a.bark() <-- IL PADRE NON PUO' USARE UN METODO DEI FIGLI
	}

}
