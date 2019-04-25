
public abstract class Pet {
	public String petName;
	public PetType petType;
	
	public Pet(String petName) {
		super();
		this.petName = petName;
	}
	
	public Pet(String petName, PetType petType) {
		super();
		this.petName = petName;
		this.petType = petType;
	}
	
	public abstract String sounds();
	public abstract String treats();
	public abstract String fun();
}
