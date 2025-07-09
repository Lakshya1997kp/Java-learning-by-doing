import java.util.LinkedList;

public class LinkList{
    public static void main(String args[]){
        LinkedList<String> fruit= new LinkedList<>();
        fruit.add("Mango");
        fruit.add("Guava");
        fruit.add("Pineapple");
        fruit.add("Apple");
        fruit.add("Orange");

        System.out.println(fruit); // this works for linkedlist

       fruit.addFirst("Stawberry");

       System.out.println(fruit);

       fruit.removeFirst();
       System.out.println(fruit);

       fruit.removeLast();
       System.out.println(fruit);

       fruit.remove(3);
       System.out.println(fruit);

    }
}
