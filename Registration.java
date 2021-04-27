package regexExp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
	
	static Scanner sc =  new Scanner(System.in);
	String regexName ="^[A-Z][a-zA-z] {3,}";
	private static final String  emailPattern =  " ^[ A-Za-z0-9\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final String firstPattern = "/^[A-Z][a-z_-]{3,19}$/";
	private static final String lastPattern = "/^[A-Z][a-z_-]{3,19}$/";
	private static final String agePattern = "[1-9]{1,2}";
	private static final String phonePattern = "[0-1]{1}[0-9]{0,2}";

	
	
	

	public static void main(String[] args) {
		
		System.out.println("Enter 1 to add ");
		int option = sc.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("enter first name:  ");
			String firstname  =  sc.nextLine();
			sc.nextLine();			
			System.out.println("enter last  name");
			String lastname =  sc.nextLine();
			
			System.out.println("enter email id :");
			String email = sc.nextLine();
			
			System.out.println("Enter Phone no : ");
			String phone =  sc.nextLine();
			
			System.out.println("Enter age : ");
			String age  =  sc.nextLine();
			
			
			
			boolean p = regex(email,emailPattern);
			boolean q = regex(firstname,firstPattern);
			boolean r = regex(lastname,lastPattern);
			boolean s = regex(phone,phonePattern);
			boolean t = regex(age,agePattern);
			
			
			if((p==true) && (q==true) && (r==true) && (s==true) && (t==true)) {
				AddDetails f = new AddDetails();
				f.cdetails(firstname, lastname, email, phone, age);
				f.show(firstname, lastname, email, phone, age);
			}else{
				System.out.println("Invalid entry");
				
			}
	
		}

	}

	
	public static boolean regex(String exp,String regexName) {
		
		Pattern p  = Pattern.compile(regexName);
		Matcher m =  p.matcher(exp);
		boolean b = m.matches();
		if (b== true) {
			return true;
		}else {
			return false;
		}
	}


}
