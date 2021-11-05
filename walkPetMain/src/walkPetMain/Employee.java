package walkPetMain;

public class Employee implements Node {
	private String firstName;
	private String lastName;
	private int age;
	private String location;
	private int userId;
	
	
	public Employee(String firstName, String lastname, int age, String location, int userId) {
		this.firstName = firstName;
		this.lastName = lastname;
		this.location = location;
		this.age = age;
		this.userId = userId;
	}
	
	
	


	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public String getFirstName() {
		return firstName;
		
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String getLocation() {
		return location;
		
	}
	
	public int getAge() {
		return age;
		
	}


	@Override
	public int getKey() {
		
		return userId;
	}



	

	

}
