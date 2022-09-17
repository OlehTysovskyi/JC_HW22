package Second_Task;

public class Main {
	
	public static void main(String[] args) {
		
		AmphibiaActivity activity = (String messange) -> messange;
		Amphibia f = new Frog("Amasonian Frog");
		System.out.println(Amphibia.activity(f," is swimming" , activity));
		System.out.println(Amphibia.activity(f," is sleeping" , activity));
		System.out.println(Amphibia.activity(f," is eating" , activity));
		System.out.println(Amphibia.activity(f," is walking" , activity));

	}
}
