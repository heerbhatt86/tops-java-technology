package Tops_Assignment;

public class array_search {
	public static void main(String[] args) {
		int[]num= {23,45,1,2,8,19,-3,16,-11,28};
		
		int ans=search(num, 8);
		System.out.println(ans);
		
		
	}
	static int search(int[]arr,int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		for(int index=0;index<arr.length;index++)
		{
			int element=arr[index];
			if(element==target) {
				return index;
			}
		}
		return -1;
	}

}
