package Second_Task;

public class Amphibia {
	
	private String name;
	
	Amphibia(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static String activity(Object Amphibia, String messange, AmphibiaActivity AmphibiaActivity) {
		return Amphibia.toString() + messange;
	}
}

interface AmphibiaActivity {
	String activity(String messange);
	
}
