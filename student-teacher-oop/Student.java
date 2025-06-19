class Student extends Person{
    private String name ;
    public Student(String name){
        super(name);
        this.name=name;
    }

    public void study(){
        System.out.println("Hii I am"+getN()+" a student and I study !!!");
    }

    @Override
    public void introduce(){
        System.out.println("Hii I am "+getN());
    }
}
