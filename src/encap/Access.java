package encap;

public class Access {

	public static void main(String[] args) {
		Car c = new Car();		
		c.setName("audi");
		System.out.println("car name :- " +c.getName ());
		
		c.setPrice(400000);
		System.out.println("car price:- "+c.getPrice());

		c.setTopSpeed("200 kmph");
		System.out.println("car TopSpeed:- "+c.getTopSpeed());
		
		System.out.println("updated car name");
		
		c.setName("BMW");
		System.out.println("car name :- " +c.getName ());
	}

}
