import java.util.ArrayList;

public class Listint{
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(3);
        nums.add(8);
        nums.add(20);
        nums.add(20);
        nums.add(50);
        nums.add(25);


        for(int n : nums){
            System.out.println(n+" ");
        }

        nums.remove(5);
        
        for(int n : nums){
            System.out.println(n+" ");
        }


        // ArrayList.sort(nums); // check how to sort arraylist 

        System.out.println(nums);

        
    }
   
    
}