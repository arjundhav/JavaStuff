package dataStructure;

public class StackTut {
    
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty()
    {
        return (top < 0);
    }

    void StackTuT()
    {
        top = -1;
    }

    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String args[])
    {
        StackTut s = new StackTut();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
    }
}

/*
  *Java program to implement basic stack
  *Operations: Push Pop Peek

  *Algorithm:

    1. Create a class Stack with the following methods:
       a. isEmpty() : Returns true if stack is empty, else false.
       b. push(int x) : Pushes an item on top of stack.
       c. pop() : Removes an item from top of stack.
       d. peek() : Returns top element of stack.
    2. Create a class StackDemo with main method.
    3. Create an object of class Stack.
    4. Push 10, 20 and 30 into the stack.
    5. Pop an element from the stack.
    6. Print the popped element.
    7. Print the top element of the stack.
    8. Exit.
    S
 */