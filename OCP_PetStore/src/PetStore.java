import java.util.ArrayList;

public class PetStore {
	
	static ArrayList<Pet> pets = new ArrayList<Pet>();

	public static void sounds() {
		for (Pet pet : pets) {
			System.out.println(pet.sounds());
		}	
	}
	
	public static void treats() {
		for (Pet pet : pets) {
			System.out.println(pet.treats());
		}
	}
	
	public static void fun() {
		for (Pet pet : pets) {
			System.out.println(pet.fun());
		}		
	}

	public static void main(String[] args) { 
		Pet pet = new Dog("Henry");
		
		pets.add(pet);
		
		Pet pet2 = new Cat("Tom");
		pets.add(pet2);
		
		Pet pet3 = new Fish("Thomas");
		pets.add(pet3);
		
		sounds();
		treats();
		fun();
	}

}
