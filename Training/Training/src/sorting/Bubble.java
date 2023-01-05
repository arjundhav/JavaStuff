package sorting;

import java.util.Arrays;

public class Bubble {
    
    public static void main(String[] args) {
        int[] arr = {4,1,10,-3,12};
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {

            // Swapping adjacent elements
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
          System.out.println("Sorted array: "+Arrays.toString(arr));
        
    }
}

/*
  Algorithm for BubbleSort:
    1. Start from the first element of the array and compare it with the next element. i.e 4 1 10 -3 12
    2. If the next element is smaller, then swap both the elements. i.e 1 4 10 -3 12
    3. If the next element is greater, then leave it as it is.   i.e 1 4 10 -3 12
    4. Repeat step 1,2,3 for all the elements in the array. i.e -3 1 4 10 12
*/