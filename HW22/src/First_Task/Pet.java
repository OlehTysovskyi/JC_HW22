package First_Task;

public abstract class Pet {
	
	private String name;
	
	public Pet(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static String scream(Object Pet, String v, PetVoice PetVoice) {
		return PetVoice.voice(Pet.toString() + "'" + v + "'");
	}
	
}

interface PetVoice {
	String voice(String voice);
}