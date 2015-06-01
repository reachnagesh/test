public class Car {
	private String name;
	private String brand;
	
	public Car(String nm, String br){
		System.out.println("non-empty constructor");
		name = nm;
		brand = br;
	}
	
	public Car(String nm) {
		name = nm;
		brand = "honda";		
	}
	
	public Car(){
		System.out.println("empty constructor");
		name = "civic";
		brand = "honda";
	}
	
	public void start(){
		System.out.println("I am starting....");
	}
	
	public void stop(){
		System.out.println("I am stopping....");
	}
	
	public static void main(String[] args){

		Car noNameNoBrand = new Car();
		System.out.println("noNameNoBrand name = " + noNameNoBrand.name);
		System.out.println("noNameNoBrand brand = " + noNameNoBrand.brand);
		
		
		
		Car accord = new Car("accord");
		System.out.println("accord name = " + accord.name);
		System.out.println("accord brand = " + accord.brand);

		Car santro = new Car("santro", "hyundai");
		
		System.out.println("car name = " + santro.name);
		System.out.println("car brand = " + santro.brand);
		
		
		
	}
}