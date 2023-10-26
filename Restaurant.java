public class Restaurant {
   private String name;
   private int employees;

   /* Your code goes here */
   
   public void setName(String _name) {
	   name = _name + "'s Cafe";
   }
   
   public void setEmployees(int _employees) {
	   employees = _employees;
   }
   
   
   
   
   
   
   public void print() {
      System.out.println("Restaurant: " + name);
      System.out.println("Total: " + employees + " employees");
   }
}