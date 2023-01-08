package com.tut;

public class ConstructorTut {
    
 // Usage of this keyword 
    public String CustName;
    public String Addr;
    public long Phone;

    public ConstructorTut(){
        System.out.println(" ------- Constructor ---------");
    }

    ConstructorTut(String cName, long phone,String addr){
        this();    //calls default constructor
        this.CustName = cName;
        this.Phone = phone;
        this.Addr = addr;
    }
    public static void main(String[] args){
        ConstructorTut a = new ConstructorTut("Arjun",7769809291L,"Cidco");
        System.out.println("Customer Name: "+a.CustName);
        System.out.println("Phone Number: "+a.Phone);
        System.out.println("Address: "+a.Addr);
    }

}
