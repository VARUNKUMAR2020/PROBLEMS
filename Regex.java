package Regex.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex 
{
    public static void main( String[] args )
    {
        System.out.println( "WELCOME TO REGEX BASED PROGRAM " );
        Pattern CONDITION = Pattern.compile("^[A-Z][a-z]{3,}");
		Matcher CHECK = CONDITION.matcher("Varunkumar");
		System.out.println("CONDITTION OF THE NAME GIVEN -"+CHECK.matches());
    }
}
