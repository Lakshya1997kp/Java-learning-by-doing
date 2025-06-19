public class Teacher extends Person{
    private String  name;
   
    public Teacher(String name){
        super(name);
        this.name=name;
    }

    public void teach(){
        System.out.println("Hii I am "+ getN() +" and I teach !!");
    }

    @Override
    public void introduce(){
        System.out.println("Hii I am "+getN());
    }
}