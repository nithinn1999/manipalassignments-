package duplicatearray;

import java.util.LinkedHashSet;

public class Main {
	public static void main(String[] args) {
		int arr[] = {1, 1,1,2,3,1,3,4,3};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(); 

    for (int i = 0; i < arr.length; i++) 
        set.add(arr[i]); 
    System.out.print(set); 
	}
}
