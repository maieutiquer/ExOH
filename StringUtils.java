/**
 * Operations on String.
 * 
 * @author daniel
 *
 */
public class StringUtils {

	/**
	 * Counts how many times the char appears in the String.
	 * 
	 * @param haystack the container string
	 * @param needle the char
	 * @return the number of occurrences, 0 if either the string or the char is null
	 */
	public static int countMatches(String haystack, char needle) {

	    int count = 0;
		for (int i=0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle) {
				// every time a match is found, increment counter
				count++;
			}
		}

		return count;

	}

}
