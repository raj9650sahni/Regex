package regexExp;

public class AddDetails implements DetailsToAdded {
	
	public String firstname;
	public String lastname;
	public String email;
	public String phone;
	public String age;
	
	
	public void ChangeDetails(String firstname,String lastname,String email,String phone,String age){
		this.age = age;
		this.firstname = firstname;
		this.lastname =  lastname;
		this.phone =  phone;
		this.email = email;
		
	}
	
	public void cdetails(String firstname,String lastname,String email,String phone,String age) {
		this.age = age;
		this.firstname = firstname;
		this.lastname =  lastname;
		this.phone =  phone;
		this.email = email;
		
	}
	
	public void show(String firstname,String lastname,String email,String phone,String age) {
		
		
		System.out.println(" Name is :" + firstname + " " + lastname);
		System.out.println("phone no is :" + phone);
	
		System.out.println(" age is :" + age);
		System.out.println("email id is  :" + email);

}
	

}
