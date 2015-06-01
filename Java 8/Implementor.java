interface InterfaceWithDefaultMethods {
	public void run();
	
	default public void printHeader() {
		System.out.println("This is the header");
	}
	default public void printFooter() {
		System.out.println("This is the footer");
	}
}

public class Implementor implements InterfaceWithDefaultMethods {
	@Override
	public void run() {
		System.out.println("This is the run() method");
	}

	@Override
	public void printFooter() {
		System.out.println("This is the custom footer");
	}
	
	public static void main(String[] args) {
		Implementor implementor = new Implementor();
		implementor.printHeader();
		implementor.run();
		implementor.printFooter();
		
	}
}