package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args){
        int[] arr = {4,1,10,-3,12};
        int n = arr.length;
        int temp;

            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
            
   // Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position 
                while (j >= 0 && arr[j] > key) {
                  arr[j + 1] = arr[j];
                  j = j - 1;
                }
                arr[j + 1] = key;
            } 
        
        System.out.println("Sorted array: "+ Arrays.toString(arr));

    }
    
}

/*

 Algorithm Insertion Sort:
    1. Start from the second element of the array and compare it with the previous element. i.e 4 1 10 -3 12
    2. If the previous element is greater, then swap both the elements. i.e 1 4 10 -3 12
    3. If the previous element is smaller, then leave it as it is.   i.e 1 4 10 -3 12
    4. Repeat step 1,2,3 for all the elements in the array. i.e -3 1 4 10 12

*/