package javaString;

public class EmailValidation {
	public static void main(String[] args) {
		
		String email = "abc@gmail.com";
		System.out.println(Pattern(email));
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
			  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
			public static boolean validate(String emailStr) {
			    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
			    return matcher.
}
