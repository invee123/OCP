
public abstract class Pet {
	public String petName;
	
	public Pet(String petName) {
		super();
		this.petName = petName;
	}
	
	public abstract String sounds();
	public abstract String treats();
	public abstract String fun();
}
