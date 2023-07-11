package topsclass_01;

public class methodoverloding {
	
	
 void desplay()

 {
	 System.out.println("1st method");
 }
void desplay(int a,int b, int c)
{
	System.out.println("A"+a);
	System.out.println("B"+b);
	System.out.println("C"+c);
	
}
	public static void main(String[] args) {
		methodoverloding m = new methodoverloding();
		m.desplay();
		m.desplay(4, 5, 6);
	}
}
