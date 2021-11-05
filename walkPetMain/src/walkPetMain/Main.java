package walkPetMain;

import java.util.ArrayList;
import java.util.Arrays;
   
public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> emloyee = new ArrayList<String>();
		emloyee.add("Edu");
		emloyee.add("Ebere");
		emloyee.add("Ovoke");
		emloyee.add("Sanctus");
		emloyee.add("Ezekiel");
		emloyee.add("Andriana");
		emloyee.add("Ghana-Conne");
		emloyee.add("Akpamu");
		emloyee.add("Akachukwu");
		emloyee.add("Zikora");
	    System.out.println(emloyee);
	   
	    
	    
		QuickSort sorts = new QuickSort();
		int[] userId = { 8, 7, 2, 1, 0, 9, 6, 3, 10 };
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(userId));

		int size = userId.length;
		 
		sorts.quickSort(userId,0,size-1);
		sorts.start();
		

		System.out.println("QuickSort: Sorted Array in Ascending Order ");
		System.out.println(Arrays.toString(userId));

		int userId2[] = { 8, 7, 2, 1, 0, 9, 6, 3, 10};
//			{"Edu","Ebere","Amaka","Nkechi","zikora"};
		int n = userId2.length;
		SelectionSort ss = new SelectionSort();
		ss.sortAlgorithm(userId2);
		System.out.println("SelectionSort: Sorted Array in Ascending Order: ");
		System.out.println(Arrays.toString(userId2));

		
		sorts.getCounter();
	}

}
