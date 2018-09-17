import java.lang.Comparable;

public abstract class Animal implements Comparable<Animal>{
	
	String name; 
	int numLegs;
	
	//getter methods
	public int getLegs() {
		return numLegs;
	}
}

