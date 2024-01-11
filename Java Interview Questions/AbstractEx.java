abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Sleep");
}
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("Bark");
    }

}
class AbstractEx{
    public static void main (String args[]){

    Dog d=new Dog();
    d.animalSound();
    d.sleep();
    }
}