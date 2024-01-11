class Base {
    protected int a;
    // Constructor of super class
    Base()
    {
        // Print statement
        System.out.println(
            "Base Class Constructor Called ");
    }
    Base(int a){
        this.a=a;
    }
}
 
// Class 2
// Sub class
class Derived extends Base {
 
    // Constructor of sub class
    Derived()
    {
 
        // Print statement
        System.out.println(
            "Derived Class Constructor Called ");
    }
}
 
class InheritanceBehavior {
 
    // Main driver method
    public static void main(String[] args)
    {
        Derived d = new Derived();
    }
}