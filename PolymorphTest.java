class Animal {
    public void eat() {
	System.out.println("I am the eat method() in the Animal class");
    }
}

public class AnimalFeeder {
    public void feedTheAnimal(Animal p) {
	p.eat();
    }
    
    public static void main(String[] args) {
    
	Animal p = new Animal();
	AnimalFeeder pmt = new AnimalFeeder();
	
	pmt.feedTheAnimal(p);
	
	pmt.feedTheAnimal(new Dog());
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("I am eat() method in Dog");
    }
}
