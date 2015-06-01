public class Patron {
	int age;
	String fName;
	String lName;
	String cardId;
	String address;
	String phoneNumber;
	
	public Patron(String firstName, String lastName, int num) {
		super();
		fName = firstName;
		lName = lastName;
		age = num;
	}

	public Patron(String firstName, String lastName, String pNum) {
		fName = firstName;
		lName = lastName;
		phoneNumber = pNum;
	}

	public Patron(String firstName, String lastName, int num, String pNum) {
		this(firstName, lastName, num);
		phoneNumber = pNum;	
	}
	
	public Patron(String firstName, String lastName, int num, String pNum, String addr) {
		this(firstName, lastName, num, pNum);
		address = addr;
	}

	public void borrow(int numBooks) {
	
	}
	
	public void borrow(int numBooks, int numVideos){
	
	}
	
	@Override
	public String toString(){
		return "First Name = " + fName + " Last Name = " + lName + " " + super.toString();
	}
	
	
	public static void main(String[] args) {
		Patron p = new Patron("John", "Smith", 32);
		
		//System.out.println(p);
		
		Object obj = p;
		
		System.out.println(p.toString());
		
		System.out.println("Object toString = " + obj.toString());
		
		((Patron)obj).borrow(10);
		
		System.out.println("p.fName = " + p.fName);
		
		p.phoneNumber = "5105551234";
		
		p.borrow(10);
		
		p.borrow(10,20);
		
	}
}