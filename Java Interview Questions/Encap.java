class Animal{
    private String name;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
class Encap{
    public static void main (String args[]){
        Animal a=new Animal();
        a.setName("Dog");
        System.out.println(a.getName());
    }
}