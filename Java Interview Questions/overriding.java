
class Animal{
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eats");
    }
}
class overriding{
    public static void main (String args[]){
        Animal an=new Dog();
        an.eat();
    }
}
