package uk.veebybeeby.animalz;

public class Cow extends Animal {

	public Cow(String name) {
		super(name);
	}

	@Override
	public String getSpecies() {
		return "Cow";
	}

	@Override
	public void sayHello() {
		System.out.println("Moo");
	}

}
