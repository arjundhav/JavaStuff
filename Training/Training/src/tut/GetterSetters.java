package tut;

public class GetterSetters {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        GetterSetters s = new GetterSetters();
        s.setAge(20);
        s.setName("Arjun");
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }

}

/*

 * Getters and Setters are used to access private variables of a class.
 * Getter returns the value , it returns the value of data type int, String,double, float, etc.
 * For the program’s convenience, getter starts with the word “get” followed by the variable name.
 * Setter sets or updates the value. It sets the value for any variable used in a class’s programs.
 * It starts with the word “set” followed by the variable name.
 
 */
