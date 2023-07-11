package topsclass_01;

interface RBI
{
	void ROI(double r);
}

class SBI implements RBI
{
	public void ROI(double r)
	{
		System.out.println("sbi rate of interest"+ r);
	}
	
	
	
}
class bob implements RBI
{
	public void ROI(double r)
	{
		System.out.println("bob rate of interest" + r);
	}
	
	
}


public class Interface {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.ROI(4.5);
		bob b = new bob();
		b.ROI(5.5);
		
	}
	

}
