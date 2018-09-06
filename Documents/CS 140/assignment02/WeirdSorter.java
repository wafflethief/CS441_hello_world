
public class WeirdSorter{
	private int[] array;
	public WeirdSorter(int[] arr){
		array = arr;
	}
	public int[] sorted(){
		for(int i = 0; i < array.length; i++){
			OneChange obj = new OneChange(array);
			array = obj.modify(i);
		}
		return array;
	}
	

}