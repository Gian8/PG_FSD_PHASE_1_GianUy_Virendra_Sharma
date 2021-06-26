package regex_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidationAssignment {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("\\d{10}", "8002413355"));
		System.out.println(Pattern.matches("[A-Z]{1}\\d{3}\\D*", "G867astgaFSesfe"));
		
		//System.out.println(Pattern.matches("[A-Z]{1}[0-9]{3}[\\D*]", "G4rRwo36AE"));
		System.out.println(Pattern.matches("[A-Z]{1}+[[0-9]{3}\\D*]{9}", "G4rRwo36AE"));
		
		System.out.println("------------------------");
		System.out.println(Pattern.matches("^(.+)@(.+)$", "firstname@prolim.com"));
		System.out.println(Pattern.matches("[A-z]+@[A-z]+\\.com", "viren@gmail.com"));
		System.out.println(Pattern.matches("^[A-z0-9]+@[A-z.]+\\.(com)$", "test123prepare@co.edu.com"));
		
		List<String> email = new ArrayList<>();
		email.add("firstname@prolim.com");
		email.add("viren@gmail.com");
		email.add("test123prepare@co.edu.com");
		
		String regex = "^[A-z0-9]+@[A-z.]+\\.(com)$";
		Pattern p = Pattern.compile(regex);
		for(String s : email)
		{
			Matcher m = p.matcher(s);
			System.out.println(s + " is a valid email: " + m.matches());
		}
	}
}
