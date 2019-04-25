import java.util.ArrayList;

public class PetStore {
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	
	public void sounds() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Meow");
			else if (pet.petType == PetType.DOG)
				System.out.println("Woof");
		}	
	}
	
	public void treats() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Give " + pet.petName + " some catnip");
			else if (pet.petType == PetType.DOG)
				System.out.println("Give " + pet.petName + " a bone");			
		}
	}
	
	public void fun() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Watch " + pet.petName + " sleep");
			else if (pet.petType == PetType.DOG)
				System.out.println("Throw a frisbee to " + pet.petName);			
		}		
	}

	public static void main(String[] args) { 
		
	}

}
