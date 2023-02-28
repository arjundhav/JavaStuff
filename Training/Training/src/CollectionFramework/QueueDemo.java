package CollectionFramework;

import java.util.*;

public class QueueDemo {

    //Queue follows FIFO(First element is removed firstS)

    //Type safe collection
    Queue<String> queue = new LinkedList<String>();
    queue.add("AJ");    
    queue.add("John");
    queue.add("Arjun");
    queue.add("Jim");
    System.out.println("Queue of names: "+queue+" \n");
    Iterator<String> itr2 = queue.iterator();
    while(itr2.hasNext()){
        String str = itr2.next();
        System.out.println(str);
    }
    queue.remove("AJ");
    System.out.println("Updated Queue: "+queue);
    System.out.println("Is Jim in queue: "+queue.contains("Jim"));
    System.out.println("Size of queue: "+queue.size());

    // ArrayDeque class implements the Deque interface.Unlike queue, we can add or delete the elements from both the ends.
    // ArrayDeque is faster than LinkedList & Stack
    Deque<String> deque = new LinkedList<String>();
    deque.add("AJ");
    deque.add("John");
    deque.add("Arjun");
    deque.add("Jack");
    deque.add("Tommy");
    deque.add("Jim");
    System.out.println("Deque of names: "+deque+" \n");
    Iterator<String> itr3 = deque.iterator();
    while(itr3.hasNext()){
        String str = itr3.next();
        System.out.println(str);
    }
    deque.remove("AJ");
    System.out.println("Updated Deque: "+deque);
    System.out.println("Is Jim in deque: "+deque.contains("Jim"));
    System.out.println("Size of deque: "+deque.size());

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
