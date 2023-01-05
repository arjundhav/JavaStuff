package searching;

public class Linear {
    
    public static void main(String[] args) {
        int[] arr = {4,1,10,-3,12};
        int n = arr.length;
        int key = 10;
        int i;

        for (i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: "+i);
                break;
            }
            else{
                System.out.println("Element not found");
                break;
            }
        }
       
    }
    

}
