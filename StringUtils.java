
public class StringUtils {

	public static int countMatches(String haystack, char needle) {

	    int count = 0;
		for (int i=0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle) {
				count++;
			}
		}

		return count;

	}

}
