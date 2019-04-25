
public class Fish extends Pet{

	public Fish(String petName) {
		super(petName);
		this.petName = petName;
	}

	@Override
	public String sounds() {
		return ("Glub");
	}
	
	@Override
	public String treats() {
		return ("Don't feed " + petName + " too much");
	}
	
	@Override
	public String fun() {
		return (petName + "is swimming upside down");
	}

}
