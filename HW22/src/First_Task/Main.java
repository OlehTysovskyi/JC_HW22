package First_Task;

public class Main {

	public static void main(String[] args) {
		
		PetVoice scream = (String voice) -> voice;
		Pet cow = new Cow("Molly");
		Pet cat = new Cat("Tom");
		Pet dog = new Dog("Ben");

		System.out.println(Pet.scream(dog, "gav-gav", scream));
		System.out.println(Pet.scream(cat, "miau-miau", scream));
		System.out.println(Pet.scream(cow, "muu-muu", scream));	
	}
}