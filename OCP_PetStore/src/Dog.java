
public class Dog extends Pet {
	
	public Dog(String petName, PetType petType) {
		super(petName, petType);
		this.petName = petName;
		this.petType = petType;
	}

	@Override
	public String sounds() {
		return ("Woof");
	}
	
	@Override
	public String treats() {
		return ("Give " + petName + " a bone");
	}
	
	@Override
	public String fun() {
		return ("Throw a frisbee to " + petName);
	}
}
