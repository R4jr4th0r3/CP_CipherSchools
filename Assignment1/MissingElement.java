class MissingElement{
	public static void main(String[] args){
		int arr[] = {1,9,5,8,2,6,7,3};
		int result = 0;
		for(int i=0;i<arr.length;i++){
			result = arr[i] ^ i;

		}
		System.out.println(result);
	}
}