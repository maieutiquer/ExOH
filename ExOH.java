
public class ExOH {

	public static void main(String[] args) {

		checkString("");
		checkString("o");
		checkString("xo");
		checkString("xx");
		checkString("oo");
		checkString("xoox");
		checkString("xoxoox");
		checkString("oooxoo");

	}

	/**
	 * Prints the given string and its ExOh() result.
	 * <p>
	 * Example:<br>
	 * ExOh('xoxoox') - true
	 * 
	 * @param str the string to be checked and printed
	 */
	public static void checkString(String str) {

		System.out.println("ExOh('" + str + "') - " + ExOh(str));

	}
	
	/**
	 * Checks whether there is an equal number of x's and o's in a string.
	 * 
	 * @param str the string to check
	 * @return true if there is an equal number of x's and o's
	 */
	public static boolean ExOh(String str) {

		int totalO = StringUtils.countMatches(str, 'o');
		int totalX = StringUtils.countMatches(str, 'x');

		if (totalO == totalX) {
			return true;
		} else {
			return false;
		}

	}

}
