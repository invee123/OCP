
public class Dog extends Pet {
	
	public Dog(String petName) {
		super(petName);
		this.petName = petName;
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
