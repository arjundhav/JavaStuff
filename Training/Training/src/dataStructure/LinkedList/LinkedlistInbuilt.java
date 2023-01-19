package dataStructure.LinkedList;

import java.util.*;

public class LinkedlistInbuilt {
   public void inbuiltWay() {
    
     LinkedList<String> cars = new LinkedList<String>();
     cars.add("Ferari");
     cars.add("Hyundai");
     cars.add("Tata");
     cars.add("Mahindra");
     System.out.println("List: "+cars);
     System.out.println("Size of list: "+cars.size());


     cars.set(0,"Maruti");
     System.out.println("New List: "+cars);

     cars.remove(0);
     System.out.println("List after removal: "+cars);
    }


    public static void main(String args[]) {
        LinkedlistInbuilt obj = new LinkedlistInbuilt();
        obj.inbuiltWay();
    }
   
}
