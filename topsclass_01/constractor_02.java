package topsclass_01;

class box1 {
	double height,width,depth;
	
	 box1() {
		System.out.println("defult constructor");
		height=4;
		width=6;
		depth=2;
		
	}
	 box1(double w,double h,double d) {
		 
		 System.out.println("parameterize consturctor");
		 
		 height= h;
		 width= w;
		 depth= d;
		
		
	}
	 box1(box1 b){
		 System.out.println("copy constuctor");
		 height=b.height;
		 width=b.width;
		 depth=b.depth;
		 
		 
	 }
	void volume() {
		System.out.println("volume"+(height*width*depth) );
	}
	
}

public class constractor_02 {
	public static void main(String[] args) {
		box1 b1=new box1();
		b1.volume();
		box1 b2=new box1(2,5,1);
		b2.volume();
		box1 b3= new box1(b2);
		b3.volume();
	}

}












































