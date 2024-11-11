package ge.mziuri.g1;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Main {

	public static void main(String[] args) {
		String regex = "^[0-9a-f]{4}(-| )(([0-9a-f]{4}\\.)+[0-9a-f]{2}|[0-9a-f]{6})$";
		Pattern p = Pattern.compile(regex);
		List<String> stringList = List.of(
			"1243 123456",
			"1243",
			"1243-123456",
			"1243-1234123456",
			"1243-1234.56",
			"1243-1234.1234.5876"
		);
		stringList.forEach(s -> {
			Matcher m = p.matcher(s);
			System.out.println(s + " " + m.matches());
		});
	}

}

class A {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
}
