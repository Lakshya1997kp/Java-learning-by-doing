public class Client{
    public static void main(String args[]){
        Person person = new Teacher("Amit");
        Person person2 = new Student("Bob");
        Teacher teacher= new Teacher("lak");
        Student student = new Student("Bob");
        Person per = new Person("ppp");

        per.introduce();

        person.introduce();
        //person.teach();//will give error Person class dont know if any method as teach exists 
        person2.introduce();

        teacher.introduce();
        teacher.teach();
        student.introduce();
        student.study();

    }
}
