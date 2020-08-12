package Quick;

public class quickSort {

	public int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i = low -1;
		
		for(int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	public void sort(int[] arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high);
			
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
		
		boolean done = false;
		if(low > high && done != true) {
			done = true;
			printArray(arr);
		}
		
	}
	
	int[] set;
	
	public void createOriginal(int length, int[] set) {
		this.set = new int[length];
		for(int i = 0; i < length; i++) {
			this.set[i] = set[i];
		}
		
	}
		
	
	public void printArray(int[] arr) {
		System.out.println("Original set: ");
		for(int i = 0; i < set.length; i++) {
			if(i < set.length-1) {
				System.out.print(set[i] + ", ");
				}else {
					System.out.println(set[i] + "\n");
			}
		}
		
		
		System.out.println("Final set: ");
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length -1) {
				System.out.print(arr[i] + ", ");
			}else {
				System.out.println(arr[i] + "\n");
			}
				
			
		}
	}
	
	
}
