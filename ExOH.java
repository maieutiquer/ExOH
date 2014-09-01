
public class ExOH {

	public static void main(String[] args) {

		System.out.println(ExOh(""));
		System.out.println(ExOh("o"));
		System.out.println(ExOh("xo"));
		System.out.println(ExOh("xx"));
		System.out.println(ExOh("oo"));
		System.out.println(ExOh("xoox"));
		System.out.println(ExOh("xoxoox"));
		System.out.println(ExOh("oooxoo"));

	}
	
	public static boolean ExOh(String str) {

		int totalO = StringUtils.countMatches(str, "o");
		int totalX = StringUtils.countMatches(str, "x");

		if (totalO == totalX) {
			return true;
		} else {
			return false;
		}

	}

}
