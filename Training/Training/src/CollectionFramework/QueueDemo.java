package CollectionFramework;

import java.util.*;

public class QueueDemo {

    //Queue follows FIFO(First element is removed firstS)

    // ArrayDeque class implements the Deque interface.Unlike queue, we can add or delete the elements from both the ends.
    // ArrayDeque is faster than LinkedList & Stack

    public void dequeDemo(){
         //Creating Deque and adding elements  
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        
        //Traversing elements  
        for(String str: deque) {
              System.out.println(str);      
        }
    }
    public static void main(String[] args) {
         
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for(int i=10;i>0;i--){
            queue.add(i);
        }

        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        //PriorityQ sorts data for us:  1 to 10 
        
        //peek - head of queue
        //poll - remove head of queue
        System.out.println("Element at head: "+queue.peek());
        System.out.println("Element at head removed: "+queue.poll());
        System.out.println("Elements of updated queue: "+queue);

         


    }
}
