package app;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Student;

public class Application {

	public static void main(String[] args) {
		Student aldo = new Student("Aldo", "Baglio");

		aldo.setAge(-20);

		System.out.println(aldo.getAge());

		Dog fido = new Dog("Fido", 2);
		Cat tom = new Cat("Tom", 10);

		fido.walk();
		fido.bark();
		fido.sayHello();
//		Animal a = new Animal("sadsad", 123);
//		
//		a.bark() <-- IL PADRE NON PUO' USARE UN METODO DEI FIGLI

		// ************** POLIMORFISMO ****************
		getAnimalInfo(fido);
		getAnimalInfo(tom);

		Animal[] animals = { fido, tom };

		for (Animal animal : animals) {
			getAnimalInfo(animal);
		}

		Animal a = new Dog("Giorgio", 4);
		Animal b = new Cat("Bruno", 5);

		a.sayHello();
		b.sayHello();

	}

	public static void getAnimalInfo(Animal a) {
		a.getInfo();

		if (a instanceof Dog) {
			((Dog) a).bark();
		}
	}

}
