package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher first = firstName.matcher("Varunkumar");
		Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher last = lastName.matcher("Venkatesan");
		Pattern email = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher mail = email.matcher("abc@gmail.com");
		Pattern Mobile = Pattern.compile("[0-9]{0,2}[1-9] [0-9]{10}");
		Matcher mobile = Mobile.matcher("91 8976544391");

		System.out.println("string matches the given Regex -" + first.matches());
		System.out.println("string matches the given Regex -" + last.matches());
		System.out.println("string matches the given Regex -" + mail.matches());
		System.out.println("string matches the given Regex -" + mobile.matches());
	}
}
