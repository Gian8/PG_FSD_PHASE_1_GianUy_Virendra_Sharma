package regex_demo;

import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[A-Z]{1}\\d{3}\\D*", "G234Gian"));
		System.out.println(Pattern.matches("[A-Z]{1}\\d{3}[A-Za-z]{6}", "G234GianUy"));
		System.out.println(Pattern.matches("[amn]", "a"));
		System.out.println(Pattern.matches("[amn]?", "n")); //? = none or 1x only
		System.out.println(Pattern.matches("[amn]+", "aaaman"));//+ = 1 or more
		System.out.println(Pattern.matches("[amn]*", "ammmaaaamn"));//* = zero or more

	}

}
