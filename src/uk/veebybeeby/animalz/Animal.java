package uk.veebybeeby.animalz;

public abstract class Animal {

	private final String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract String getSpecies();

	public static void main(String[] args) {
		Animal sid = new Cow("Sid");
		System.out.println(
				sid.getName() + " the " + sid.getSpecies());
		sid.sayHello();

		Animal a = new Elephant("Bella");
		System.out.println(
				a.getName() + " the " + a.getSpecies());
		a.sayHello();
	}

	public abstract void sayHello();

}
