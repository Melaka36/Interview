interface Animal{
    public void animalSOund();
    public void sleep();
}

class Dog implements Animal{
    public void animalSOund(){
        System.out.println("Whoo");
    }
    public void sleep(){
        System.out.println("Sleep");   
    }
}
class InterfaceEx{
        public static void main (String args[]){
            Dog d=new Dog();
            d.animalSOund();
        }
        
}