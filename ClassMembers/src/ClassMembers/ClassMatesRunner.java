package ClassMembers;

public class ClassMatesRunner {

	public static void main(String[] args) {

		Classmates a = new Classmates("Tayyub", "Ali");
		Classmates b = new Classmates("Ridwan", "Kawsar");
		Classmates c = new Classmates("Toseef", "Mehdi");

		a.setFirstName("Tayy");
		b.setFirstName("Rid");
		c.setFirstName("Tos");
		
		a.setSurname("Ali");
		b.setSurname("Kawsar");
		c.setSurname("Mehdi");
		
		System.out.println(a.getFirstName());
		System.out.println(b.getFirstName());
		System.out.println(c.getFirstName());
		
		System.out.println(a.getSurname());
		System.out.println(b.getSurname());
		System.out.println(c.getSurname());

	}

}
