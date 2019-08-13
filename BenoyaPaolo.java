import java.util.Scanner;
public class BenoyaPaolo {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		String course;
		String section;
		String address;
		String cn;
		
		System.out.println("What is your name");
		name = sc.nextLine();
		System.out.println("Your Name is "+ name);
		
		System.out.println("What is your course");
		course = sc.nextLine();
		System.out.println("Your Course is "+ course);
		
		System.out.println("What is your section");
		section = sc.nextLine();
		System.out.println("Your Section is "+ section);
		
		System.out.println("What is your address");
		address = sc.nextLine();
		System.out.println("Your Address is "+ address);
		
		System.out.println("What is your contact number");
		cn = sc.nextLine();
		System.out.println("Your Contact Number is "+ cn);
		
		System.out.println("Your Common Biography is "+ name + ". Your Course is " + course + ". Your Section is "+ section + ". Your Address is "+ address +
			 ". Your Contact Number is "+ cn);
	}
}