import java.util.Arrays;
import java.util.concurrent.Callable;

public class Java8Examples {
	public static void main(String[] args) {
	
		//Before Java 8
		Runnable rAnonymous = new Runnable(){
			@Override
			public void run() {
				System.out.println("Hello from anonymous inner runnable class!");
			}
		};

		rAnonymous.run();
		
		//Lambda expression with no param, no return value
		Runnable rLambda = () -> System.out.println("Hello from Runnable Lambda!");
		rLambda.run();
		
		//Lambda expression with multiple expressions
		rLambda = () -> {
						 int i=0; 
						 System.out.println("Hello again from Runnable Lambda!");
						};
		rLambda.run();
		
		//Lambda expression with params
		Arrays.asList(1,2,3).forEach(e -> System.out.println("Square of " + e + " is: " + (e*e)));
		
		runTheRunnable(() -> System.out.println("Hello from runTheRunnable"));
		callTheCallable(() -> {System.out.println("Hello from callTheCallable"); return new Integer(10);});
		
		Integer[] intArray = new Integer[20000];
		for (int i=1; i<= intArray.length; i++) {
			intArray[i-1] = i;
		}
		
		//Lambda expression with stream()
		Arrays.asList(intArray).stream().forEach(e -> {if (e%10000 == 0) {System.out.println("Square of " + e + " is: " + (e*e));}});
		
		//Lambda expression with parallelStream()
		Arrays.asList(intArray).parallelStream().forEach(e -> {if (e%10000 == 0) {System.out.println("Square of " + e + " is: " + (e*e));}});
		
		//Method reference
		Arrays.asList(1,2,3).stream().forEach(System.out::print);
	}
	
	private static void runTheRunnable(Runnable runnable) {
		runnable.run();
	}
	
	private static void callTheCallable(Callable callable) {
		try {
			callable.call();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}