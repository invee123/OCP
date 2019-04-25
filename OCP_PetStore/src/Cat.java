
public class Cat extends Pet {
	
public Cat(String petName) {
		super(petName);
		this.petName = petName;
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
