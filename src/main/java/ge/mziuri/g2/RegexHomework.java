package ge.mziuri.g2;

import java.util.List;

public class RegexHomework {

	/**
	 * გაუშვით main მეთოდი თქვენი კოდის დასატესტად. თუ ქართული ასოების შეცდომა გამოვა, სცადეთ ხელახლა სანამ არ გასწორდება.
	 */
	public static void main(String[] args) {

		List<String> numbers = matchNumbers("abcd123efgh4567");
		assert numbers.size() == 2;
		assert numbers.get(0).equals("123");
		assert numbers.get(1).equals("4567");

		List<String> chars = matchCharsWithVowels("abcd123efghi45jklm67");
		assert chars.size() == 2;
		assert chars.get(0).equals("abcd");
		assert chars.get(1).equals("efgh");

		assert matchIp("127.0.0.10");
		assert matchIp("192.168.0.255");
		assert !matchIp("192.168.0.256");
		assert !matchIp("300.168.0.256");
		assert !matchIp("192.168.0.255.1");

		assert matchEmail("saba.zedginidze@mziuri.ge");
		assert !matchEmail("saba.zedginidze@mziuri");
		assert !matchEmail("saba.zedg.inidze@mziuri.ge");
		assert !matchEmail("saba.2003@mziuri.ge");

		assert matchPhone("+995 555-123-456");
		assert !matchPhone("+995 555-123-4567");
		assert !matchPhone("+995 555-1234-456");
		assert !matchPhone("555-123-456-789");

	}

	/**
	 * დაწერეთ regex რომელიც დააბრუნებს მხოლოდ გადაცემული string-ში მიმდევრობით არსებულ ციფრებს
	 */
	private static List<String> matchNumbers(String s) {
		throw new UnsupportedOperationException("Delete this line and write your code");
	}

	/**
	 * დაწერეთ regex რომელიც დააბრუნებს ისეთ ასოების მიმდევრობებს, რომელიც იწყება ხმოვნებით
	 */
	private static List<String> matchCharsWithVowels(String s) {
		throw new UnsupportedOperationException("Delete this line and write your code");
	}

	/**
	 * დაწერეთ regex რომელიც დაბეჭდავს true/false-ს - არის თუ არა მოცემული string ვალიდური ip მისამართი (ფორმატი: x.x.x.x, სადაც 0 <= x <= 255)
	 */
	private static boolean matchIp(String s) {
		throw new UnsupportedOperationException("Delete this line and write your code");
	}

	/**
	 * დაწერეთ იმეილის regex შემდეგი ფორმატით: saxeli.gvari@mziuri.ge
	 */
	private static boolean matchEmail(String s) {
		throw new UnsupportedOperationException("Delete this line and write your code");
	}

	/**
	 * დაწერეთ ტელეფონის ნომერის რეგექსი ფორმატით: +995 5xx-xxx-xxx, სადაც 0 <= x <= 9
	 */
	private static boolean matchPhone(String s) {
		throw new UnsupportedOperationException("Delete this line and write your code");
	}

}