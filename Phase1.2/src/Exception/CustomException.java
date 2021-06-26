package Exception;

public class CustomException {

	static void validate(int salary) throws SalaryException{
		if(salary < 2000) {
			throw new SalaryException("You need to work hard!");
		} 
		if (salary >= 2000 && salary <= 5000) {
			throw new SalaryException("You're salary is somewhat good");
		}
		if (salary > 5100 && salary < 9000) {
			throw new SalaryException("You're salary is very good!");
		}
		else {
			System.out.println("Excellent salary");
		}
	}
	
	public static void main(String[] args) {

		try {
			validate(8000);
		} catch(Exception m) {
			System.out.println("Exception occured: " + m.getMessage());
		}
		System.out.println("rest of code...");

	}

}
class SalaryException extends Exception{
	SalaryException (String s){
		super(s);
	}
}
