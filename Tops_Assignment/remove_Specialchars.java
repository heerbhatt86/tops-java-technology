package Tops_Assignment;

public class remove_Specialchars {
	public static void main(String[] args) {
		
		
		String str ="$ja!va$#&st%ar";
		
		String remove=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(remove);
	}

}
