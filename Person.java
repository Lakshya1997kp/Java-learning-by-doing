public class Person{
    public String  name ;
    
    public  Person(String name){
        this.name=name;
    }
    void introduce(){
        System.out.println("Hii I am "+name);
    }

    public String getN(){
        return name;
    }
}