package uk.veebybeeby.animalz;

public class Elephant extends Animal {

	public Elephant(String name) {
		super(name);
	}

	@Override
	public String getSpecies() {
		return "Elephant";
	}

	@Override
	public void sayHello() {
		System.out.println("TRUMPH!");
	}
}
