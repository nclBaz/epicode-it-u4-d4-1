package entities;

public class Student {

	// Attributi di istanza
	private String firstName;
	private String lastName;
	String id;
	private int age;

	// Attributi statici
	static String school = "Epicode";

	// Costruttori
	public Student() { // COSTRUTTORE I
		this.firstName = "Giacomo";
		this.lastName = "Poretti";
	}

	public Student(String fn) { // COSTRUTTORE II
		this.firstName = fn;
		this.lastName = "Cognome Generico";
	}

	public Student(String fn, String ln) { // COSTRUTTORE III
		this.firstName = fn;
		this.lastName = ln;
	}

	// Getters & Setters

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String fn) {
		if (fn.equals("Ajeje")) {
			System.out.println("Ajeje non è un valore valido");
		} else {
			this.firstName = fn;
		}
	}

	public String getFirstName() {
		return this.firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Età deve essere maggiore o uguale a zero");
		} else {
			this.age = age;
		}
	}

	// Metodi di istanza
	private void sayHello() {
		System.out.println("Ciao! Sono " + this.firstName);
	}

	// Metodi statici
	static void staticMethod() {
		System.out.println("Ciao sono un metodo statico!");
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.firstName == s.firstName && this.lastName == s.lastName) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}


}
