package sortTechniques;
import java.util.Arrays;

public class Selection {
    
        public static void main(String[] args) {
            int[] arr = {4,1,10,-3,12};
            int n = arr.length;
            int temp;
            for (int i = 0; i < n; i++) {
                int min = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
            System.out.println("Sorted array: "+ Arrays.toString(arr));
            
        }
    
}

