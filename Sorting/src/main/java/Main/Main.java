package Main;
import java.util.ArrayList;


import java.util.Scanner;

import Bubble.bubbleSort;
import Merge.mergeSort;
import Heap.heapSort;
import Quick.quickSort;

public class Main{
	
	
	
	
	static bubbleSort b = new bubbleSort();
	static mergeSort m = new mergeSort();
	static heapSort h = new heapSort();
	static quickSort q= new quickSort();
	static Scanner s = new Scanner(System.in);
	
	static int[] set;
	
	public static void main(String[] args) {
		
		System.out.println("1: Bubble");
		System.out.println("2: Merge");
		System.out.println("3: Heap");
		System.out.println("4: Quick");
		
		int choice = s.nextInt();
		
	getInput();

	createSet();
	
	if(choice == 1) {
		//Bubble Sort
		b.sort(set);
	}else if(choice == 2) {
		//Merge Sort
		
	}else if(choice == 3) {
		//Heap Sort
		
	}else if(choice ==4) {
		//Quick Sort
		q.createOriginal(set.length, set);
		q.sort(set, 0, set.length-1);
		
		
		}
	
	s.close();
	
	

}
	
	static String input;
	static ArrayList<Integer> temp = new ArrayList<Integer>();
	//get input from user and stop when ! is entered
	public static void getInput() {
		while(true) {
			System.out.println("Enter a number or ! to exit: ");
			input = s.next();
			if(input.equals("!")) {
				break;
			}else {
				temp.add(Integer.parseInt(input));
			}
		}
	}
	
	
	//initialize set array and add user inputs to it
	public static void createSet() {
		set = new int[temp.size()];
		
		for(int i = 0; i<set.length; i++) {
			set[i] = temp.get(i);
		}
	}


	
		
	}


