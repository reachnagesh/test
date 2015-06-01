public abstract class Animal {

	public int weight;
	
	public int size;
	
	public String address;
	
	public Animal() {
	
	}
	
	
	public abstract void eat(); 
	
	public abstract void breathe();
	
	public abstract void procreate();
	
	public static void main() {
		Animal animal = new Animal();
		animal.eat();
	}
}