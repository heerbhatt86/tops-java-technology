package topsclass_01;
class box 
{
	double width,height,depth;
	public box()
	{
		System.out.println("defult constructor called");
		width=3;
		height=4;
		depth=3;
	}
	box(double w,double h,double d)
	{
		System.out.println("parameterize constructor called");
		width=w;
		height=h;
		depth =d;
		
	}
	box(box b)
	{
		System.out.println("copy constructor called");
		width =b.width;
		height=b.height;
		depth =b.depth;
	}
	void volume()
	{
		System.out.println("width"+width+ " height"+ height+ " depth"+depth);
	}
	
	
}

public class constructordemo {
	public static void main(String[] args) {
		box b1 = new box();
		box b2 = new box(15,46,79);
		box b3 = new box();
		b1.volume();
		b2.volume();
		b3.volume();
		
		
			}

	

}
