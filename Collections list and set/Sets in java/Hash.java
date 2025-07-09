import java.util.HashSet;
public class Hash{
    public static void main(String args[]){
        HashSet<String> fruits= new HashSet<>();
        fruits.add("Mango");
        fruits.add("Leeche");
        fruits.add("Guava");
        fruits.add("Oranges");

        System.out.println(fruits);

        fruits.remove("Guava");
        System.out.println(fruits);

       System.out.println(fruits.contains("Jackfruit"));

        fruits.clear();

        System.out.println(fruits.isEmpty());
        System.out.println(fruits);
    }
}