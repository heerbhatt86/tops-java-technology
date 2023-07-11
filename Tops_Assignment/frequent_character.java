package Tops_Assignment;

public class frequent_character {
	public static void main(String[] args) {

		String str = "successes";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (str.charAt(i) == str.charAt(j)) {

					System.out.print(ch[i]);
					count++;

				}

			}
		}
	}
}
