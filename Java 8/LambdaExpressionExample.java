import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressionExample {
	private static final int AGE_LIMIT = 30;

	public static void main(String[] args) {
		List<Person> pList = buildList();

		printEachPersonInTheList(pList);

		printAllYoungunsInTheList(pList);
		
		printEachDevInTheList(pList);
		
		printEachQEInTheList(pList);

		//This is ridiculous. Why can't I pass the type of Role to a method?
		printEachPersonBasedOnRole(pList, Role.DEV);
		
		printEachPersonBasedOnRole(pList, Role.QE);

		//What if I want to print only Persons who are young?
		printMatchingPersons(pList, p -> p.age < AGE_LIMIT);
		//What if I want to print all young 'uns?
		printMatchingPersons(pList, p -> (p.role==Role.QE && p.age < AGE_LIMIT));
		
		//The above methods use 'external iterations'
		//What about internal iteration?
		printMatchingPersonsWithInternalIteration(pList, p -> (p.role==Role.QE && p.age < AGE_LIMIT));
		
		celebrateBirthdayWithJDK7(pList);

		watchWhatJDK8CanDo(pList);
		
		whosYourFavoriteInciter(pList);
		
		whosTheYoungestInciter(pList);
	}

	private static void printMatchingPersons(List<Person> pList, Predicate<Person> pred) {
		System.out.println("Printing persons who match the criteria");
		for (Person person : pList) {
			if (pred.test(person)) {
				System.out.println(person);		
			}
		}
		System.out.println("******DONE Printing all persons that match the criteria");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void printMatchingPersonsWithInternalIteration(List<Person> pList, Predicate<Person> pred) {
		System.out.println("Internal Iteration - Printing persons who match the criteria");
		pList.stream().filter(pred).forEach(System.out::println);
		System.out.println("******DONE Internal Iteration - Printing all persons that match the criteria");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void printEachPersonInTheList(List<Person> pList) {
		System.out.println("******Printing all persons");
		for (Person p : pList) {
			System.out.println(p);
		}
		System.out.println("******DONE Printing all persons");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void printEachDevInTheList(List<Person> pList) {
		System.out.println("******Printing all developers");
		for (Person p : pList) {
			if (p.role == Role.DEV)
				System.out.println(p);
		}
		System.out.println("******DONE Printing all developers");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void printAllYoungunsInTheList(List<Person> pList) {
		System.out.println("******Printing all Younguns");
		for (Person p : pList) {
			if (p.age < AGE_LIMIT)
				System.out.println(p);
		}
		System.out.println("******DONE Printing all younguns");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}

	private static void printEachQEInTheList(List<Person> pList) {
		System.out.println("******Printing all QEs");
		for (Person p : pList) {
			if (p.role == Role.QE)
				System.out.println(p);
		}
		System.out.println("******DONE Printing all QEs");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void printEachPersonBasedOnRole(List<Person> pList, Role role) {
		System.out.println("******Printing persons with Role: " + role);
		for (Person p : pList) {
			if (p.role == role)
				System.out.println(p);
		}
		System.out.println("******DONE Printing all " + role + "s");
		System.out.println("-------------------------------");
		System.out.println(" ");
	}
	
	private static void celebrateBirthdayWithJDK7(List<Person> pList) {
		for (Person p : pList) {
			p.age++;
			System.out.println("Happy Birthday " + p.firstName
					+ "! You are now: " + p.age + "!");
		}
	}

	private static List<Person> buildList() {
		Person puneet = new Person("Puneet", "Randhawa", 48, Role.PO);
		Person gaurang = new Person("Gaurang", "Pathare", 32, Role.DEV);
		Person udyan = new Person("Udyan", "Dutta", 29, Role.QE);
		Person kent = new Person("Kent", "Cheung", 24, Role.QE);
		Person victor = new Person("Victor", "Hsu", 19, Role.DEV);
		Person erwin = new Person("Erwin", "Cabral", 22, Role.DEV);

		List<Person> pList = new ArrayList<>();
		pList.add(erwin);
		pList.add(kent);
		pList.add(puneet);
		pList.add(victor);
		pList.add(udyan);
		pList.add(gaurang);

		return pList;
	}

	private static void watchWhatJDK8CanDo(List<Person> pList) {
		pList.forEach(p -> {
			System.out.println(p.firstName
				+ ", Java 8 makes you younger. You are now : " + --p.age);
		});
	}
	
	private static void whosYourFavoriteInciter(List<Person> pList) {
		pList.stream().filter(p -> (p.age < 25 && p.role == Role.QE)).forEach(System.out::println);
	}

	private static void whosTheYoungestInciter(List<Person> pList) {
		Person youngest = pList.stream()
		     .min((p1, p2) -> (Integer.compare(p1.age, p2.age))).get();
		
		System.out.println("Youngest Inciter is: " + youngest);
	}

}

class Person {
	String firstName;

	String lastName;

	int age;

	Role role;

	Person(String firstName, String lastName, int age, Role role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName + "; age: " + age
				+ "; Role: " + role;
	}
}

enum Role {
	DEV, QE, PO, ARCHITECT;
}