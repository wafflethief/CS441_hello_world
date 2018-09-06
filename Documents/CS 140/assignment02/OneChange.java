
public class OneChange{
	private int[] array;
	
	public OneChange(int[] arr){
		array = arr;	
	}
	
	public int smallestAfter(int start){
		int indexToReturn = start;
		for(int i = start; i < array.length; i++){
			if(array[i] < array[start]){
				indexToReturn = i;
			}
		}
		return indexToReturn;
	}
		
	public int[] modify(int start){
		int[] temp = new int[array.length];
		var k = smallestAfter(start);
		for(int j = 0; j < start; j++){
			temp[j] = array[j];
		}
		temp[start] = array[k];
		for(int j = start; j < k; j++){
			temp[j+1] = array[j];
		}
		for(int j = k+1; j < array.length; j++){
			temp[j] = array[j];
		}
		
		return temp;
	}
}