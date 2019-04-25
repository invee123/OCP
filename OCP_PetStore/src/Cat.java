
public class Cat extends Pet {
	
public Cat(String petName, PetType petType) {
		super(petName, petType);
		this.petName = petName;
		this.petType = petType;
	}

	@Override
	public String sounds() {
		return ("Meow");
	}
	
	@Override
	public String treats() {
		return ("Give " + petName + " some catnip");
	}
	
	@Override
	public String fun() {
		return ("Watch " + petName + " sleep");
	}
}
