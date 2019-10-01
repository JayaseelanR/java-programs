
public class Horizontal {

	public static void main(String[] args) 
	{
		int x[] = {5,3,4};
		horizontalhist(x);
	}
	public static void horizontalhist(int n[])
	{
		int i=0,j;

		while(i<n.length)
		{
			j=0;
			while(n[i]>j)
			{
				System.out.print("-");
				j++;
			}
			System.out.println();
			i++;
		}
		return;
	}

}

