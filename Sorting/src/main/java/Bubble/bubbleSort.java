package Bubble;

public class bubbleSort {

	
	public void sort(int[] a) {
		int temp;
		
		System.out.print("Original Set: ");
		for(int l = 0; l < a.length; l++) {
			if(l < a.length -1) {
				System.out.print(a[l] + ", ");
			}else {
				System.out.print(a[l] + "\n");
			}
		}
		
		
		for(int i = a.length -1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print("Final Set: ");
		for(int l = 0; l < a.length; l++) {
			if(l < a.length -1) {
				System.out.print(a[l] + ", ");
			}else {
				System.out.print(a[l] + "\n");
			}
		}
	}
	
	
	
}
