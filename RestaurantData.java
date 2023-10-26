import java.util.Scanner;

public class RestaurantData {  
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Restaurant restaurant = new Restaurant();
      String inputName;
      int inputEmployees;
   
      inputName = scnr.next();
      inputEmployees = scnr.nextInt();
      restaurant.setName(inputName);
      restaurant.setEmployees(inputEmployees);
   
      restaurant.print();
   }
}	