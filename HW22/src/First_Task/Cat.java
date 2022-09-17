package First_Task;

public class Cat extends Pet{
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return getName() + " says -> ";
	}
}
