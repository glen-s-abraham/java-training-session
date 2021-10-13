
public class Array {
	public int[] sort(int[] array,String order) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(order.equals("asc")){
					if(array[i]>array[j]) {
						int temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
				if(order.equals("desc")) {
					if(array[i]<array[j]) {
						int temp = array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
				
			}
		}
		return array;
	}
	
	public int linearSearch(int key, int[] array) {
		for(int i=0;i<array.length;i++) {
			if(array[i]==key)
				return i;
		}
		return -1;	
	}
	
	public int max(int[] array) {
		int max=0;
		for(int i=0;i<array.length;i++)
			if(array[i]>max)
				max=array[i];
		return max;
	}
	
	public int min(int[] array) {
		int min=array[1];
		for(int i=0;i<array.length;i++)
			if(array[i]<min)
				min=array[i];
		return min;
	}
}
