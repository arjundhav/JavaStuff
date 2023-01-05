package searching;

public class Binary {

    public static void main(String[] args){
        int[] arr = {4,1,10,-3,12};
        int n = arr.length;
        int key = 10;
        int l = 0;
        int r = n-1;
        int mid = (l+r)/2;

        while (l <= r) {
            if (arr[mid] == key) {
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if (arr[mid] < key) {
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
            mid = (l+r)/2;
        }
        if (l > r) {
            System.out.println("Element not found");
        }
    }

}
