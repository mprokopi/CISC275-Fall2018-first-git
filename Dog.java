
public class Dog extends Animal{

	public Dog(String name, int legs) { //constructor with parameters
		this.name = name;
		this.numLegs = legs;
	}
	
	@Override
	public int compareTo(Animal a) {
		return this.numLegs - a.numLegs;
	}

	public String toString() {
		return name;
	}
}
