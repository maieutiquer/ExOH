
public class StringUtils {

	public static int countMatches(String str, String sub) {

		return str.length() - str.replaceAll(sub, "").length();

	}

}
