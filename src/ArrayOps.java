
public class ArrayOps {
	public static void main(String[] args) {
		int array[]= {22,10,3,21,6};
		Array arrOps = new Array();
		
		//Sorting Ascending
		for(int num:arrOps.sort(array,"asc"))
			System.out.print(num+" ");
		
		System.out.println();
		
		//Sorting Descending
		for(int num:arrOps.sort(array,"desc"))
			System.out.print(num+" ");
		
		System.out.println();
		
		//Linear search
		int position = arrOps.linearSearch(22, array);
		if(position>-1)
			System.out.println("Element found at "+position);
		else
			System.out.println("Element not found");
		
		System.out.println(arrOps.max(array));
		System.out.println(arrOps.min(array));
		
		//Second largest when no duplicates elements are present
	
		System.out.println("Second largest "+arrOps.sort(array,"desc")[1]);			
	}
}
