import java.util.*;

class MajorityElement{
	
	static void majorityElement(int[] arr){
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++){
			if(m.containsKey(arr[i])){
				int count = m.get(arr[i])+1;
				if(count > arr.length/2 ){
					System.out.println(arr[i]);
					return;
				}
				else{
					m.put(arr[i],count);
				}
			}
			else{
				m.put(arr[i],1);
			}
		}
			System.out.println("No Majority Element");
		
	}





	public static void main(String[] args){
		int []arr = new int[] {3,3,4,2,4,4,2,4,4};
		majorityElement(arr);
	}
}