package First_Task;

public class Dog extends Pet{

	public Dog(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return getName() + " says -> ";
	}
}
