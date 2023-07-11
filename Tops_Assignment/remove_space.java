package Tops_Assignment;

public class remove_space {

	public static void main(String[] args) {
		
		String str="j a va s t a r";
		
		String remove=str.replaceAll("\\s", "");
		System.out.println(remove);
	}
}
