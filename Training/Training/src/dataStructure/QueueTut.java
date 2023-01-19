package dataStructure;

import java.util.*;

public class QueueTut {

    public static void main(String args[]) {
        Queue<String> q = new LinkedList<>();
        q.add("Arjun");
        q.add("Bhavesh");
        q.add("Chirag");
        q.add("Dhruv");
        System.out.println("Elements of queue: " + q);
        System.out.println("Queue Size: "+q.size());

        q.remove();
        q.remove("Chirag");
        System.out.println("Elements of queue after remove: " + q);
        System.out.println("Is element present in Queue? "+q.contains("Arjun"));

        String head = q.peek();
        System.out.println("Head of queue: " + head);
        
        //to empty queue
        //q.clear();
    }
}
