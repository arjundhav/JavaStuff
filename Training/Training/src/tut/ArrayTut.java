package tut;

public class ArrayTut {

	public static void main(String[] args) {
		//int[] arr = new int[]
		int a[]={2,4,6,8,10};
		System.out.println("Element at index 1 : "+a[1]); //access element by index value
		System.out.println("Length of array: "+a.length+"\n");
		
		for(int i=0;i<5;i++){
			System.out.println("Traversing elements of array: "+a[i]+"\n");
		}
		
		//multidimensional array
		int b[][] = {{1,2},{3,4},{5,6}};
		System.out.println(b[0][0]);
		System.out.println(b[0][1]+"\n");
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++) {
		    	System.out.println("Traversing elements of multi-d array: "+b[i][j]+"\n");
		    }
		}
		
	
    //System.arraycopy(source,0,destination,1,5)
		int c[]= {1,2,3,4,5};
		int d[] = {9,8,7,4,6};
		System.arraycopy(d,1,c,1, 3);
		System.out.println("After copying value at index 1 of c: "+c[1]+"\n");
		
		
	// Copying the element from one array to another	
		int p[] = { 3, 8, 3 };
		int q[] = new int[p.length];   //Create an array q[] of same size as p[]

	    q = p;       // Doesn't copy elements of p[] to q[], only makes q refer to same location
	
	    q[0]++;  // Change to q[] will also reflect in p[], as 'p' and 'q' refer to same location.

		System.out.println("Contents of p[] : ");
		for (int i = 0; i < p.length; i++){
			System.out.print(p[i] + " ");
		}
		
		System.out.println("\n\nContents of q[] : ");
		for (int i = 0; i < q.length; i++){
		 System.out.print(q[i] + " ");
		}   
	}	
 }

/* 
   Array is linear collection of data of similar data type
   It follows indexing(starts with 0) & static in nature(size is fixed can't be changed).
   Length of array is set before declaration
   
     int []a={1,2,3};

   multi-dimensional array:
  
    int [][]a = new int[x][y]
    
    x - row , y - column
    
     x * y = no.of elements
    
  

*/