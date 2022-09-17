package First_Task;

public class Cow extends Pet {
	
	public Cow(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return getName() + " says -> ";
	}
}
