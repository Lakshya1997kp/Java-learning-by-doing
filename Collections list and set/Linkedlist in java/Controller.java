import java.util.Scanner;
public class Controller{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Linkedlist list = new Linkedlist();
        System.out.println("Number of elements you wanna enter: ");
        int nums = input.nextInt();
         System.out.println("Enter the elements : ");
       for(int i=0; i<nums;i++){
       
        list.insertAtLast(input.nextInt());
       }

        System.out.println("Your entered elements : ");
        list.display();
    }
}