import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) 
	{

		//testSearch();
		testSelectionSort();
		
	}
	public static void testSearch()
	{
		int ans;
		int x[]={2,25,49,12,37,57,68,3};
		ans=search(x,5,x.length);
		System.out.println(ans);

		int y[]={10,2,30,40,50,60,70,80,4};
		ans=search(y,0,y.length);
		System.out.println(ans);

		int z[]={1,2,49,12,3,57,22,1};
		ans=search(z,3,7);
		System.out.println(ans);
		
	}
	public static void testSelectionSort()
	{
		int a[]={12,65,56,2,78,34};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
		
		int g[]={78,56,98,43,87,93};
		selectionSort(g);
		System.out.println(Arrays.toString(g));

		int f[]={10,20,30,40,50};
		selectionSort(f);
		System.out.println(Arrays.toString(f));

	}
	public static void selectionSort(int x[])
	{
		int k=0,temp;
		
		while(k<x.length-1)
		{
			int pos=search(x, k, x.length);
			//System.out.println(pos);

			temp=x[k];
			x[k]=x[pos];
			x[pos]=temp;

			//System.out.println(Arrays.toString(x));
			k++;
		}
		return;
	}
	
	public static int search(int a[],int start,int end)
	{	
		int spos=start;
		
		start++;
		while(start<end)
		{
			if(a[spos]>a[start])
			{	
				spos=start;
			}	
			start++;
		}
		return spos;
	}
	
}
