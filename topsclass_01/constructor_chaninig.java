package topsclass_01;

class  T{
	T(){
		System.out.println("T default constructor");
	}
	T(int a){
		System.out.println("value of A"+a);
	}
	void show(){
		System.out.println("show from T");
		
	}
	
}
class R extends T{
	R(){
		System.out.println("R default constructor");
	}
	R(int a,int b){
		super(a);
		System.out.println("value of A and B"+b);
	}
	void show() {
		super.show();
		System.out.println("show from R");
	}
}
class S extends R{
	S(){
		System.out.println("S default constructor");
	}
	S(int a,int b,int c){
		super(a,b);
		System.out.println("value of A B and C"+c);
	}
	void show() {
		super.show();
		System.out.println("show from S");
	}
}



public class constructor_chaninig {
public static void main(String[] args) {
	
	S s1 = new S(4,5,4);
	s1.show();
	
	
}
}
