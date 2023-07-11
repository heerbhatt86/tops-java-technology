package topsclass_01;

public class GenericDemo {
	
	public static <E> void printArry (E[] inputarray)
	{
		for(E e : inputarray)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		
	}
public static void main(String[] args) {
	
	Integer i[]= {1,2,3,4,5};
	String s[]= {"shraddha,gudu,pooja"};
	Character c[]= {'s','g','p'};
	Double darry[]= {1.1,2.2,3.3};
	
	printArry(i);
	printArry(s);
	printArry(c);
	printArry(darry);
	
}
}
