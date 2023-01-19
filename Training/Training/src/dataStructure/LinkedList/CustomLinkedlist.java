package dataStructure.LinkedList;

public class CustomLinkedlist{

    Node head;
    static class Node{
        int data;
        Node next;

      //Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }

    //Method to insert a new node
    public static CustomLinkedlist insert(CustomLinkedlist list, int data){
        
       //Create new node with given data 
        Node new_node = new Node(data);
        new_node.next = null;

        //If the Linked List is empty, then make the new node as head
        if(list.head == null){
            list.head = new_node;
        }else{
            //Else traverse till the last node and insert the new_node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        //Return the list by head
        return list;
    }

    //Method to print the LinkedList
    public static void printList(CustomLinkedlist list){
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while(currNode != null){
            System.out.print(currNode.data+" ");
            currNode = currNode.next;
        }
    }

    public static void main(String args[]){

        CustomLinkedlist list = new CustomLinkedlist();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);

        printList(list);
        
    }
}