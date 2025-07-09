import java.util.ArrayList;
public class ListString{
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        
        names.add("Lakshya");
        names.add("Amit");
        names.add("Abmitabh");
        names.add("Hero");
        names.add("Tyson");

        for(String n : names){
            System.out.println(n);
        }

        System.out.println(names);// this works for array list too
    }
}