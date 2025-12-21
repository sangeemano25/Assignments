package assignments;

//Store the values in Array and Print second and third largest number from the above values without 
//using collections and default sort methods

public class Assignment9_ArraysAndLoops {

	public static void main(String[] args) {
		int[] arr= {12,34,11,36,87,98,93};
		System.out.println(arr.length); //  7
		int n =arr.length; 
		for (int i = 0; i < n - 1; i++) { //i starts from 0 to 6
            for (int j = i + 1; j < n; j++) { // j=i+1 starts from second position from 1 to 7  

                if (arr[i] > arr[j]) { // if left side is greater, then swap values
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		 System.out.print("Sorted Array: ");
	        for (int num : arr) {
	            System.out.println(num + " ");
	            
				}
	        System.out.println("**************************************");
	        System.out.println("Second largest number in the array: "+arr[n-2]);
	        System.out.println("Second largest number in the array: "+arr[n-3]);
	        
	        
	}

}
