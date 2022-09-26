package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}");//first name start with capital and has minimum 3 chararcters
		Matcher first = firstName.matcher("Varunkumar");
		Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher last = lastName.matcher("Venkatesan");

		System.out.println("string matches the given Regex -"+first.matches());
		System.out.println("string matches the given Regex -"+last.matches());
}
	}

