package assignmentTwo;

public class ThrowWithArg {
		
   public static void main (String args[]) { 
      try {
         throw new Exception("throwing an exception");
      } catch (Exception e) {
         System.out.println(e.getMessage());
      }
   }	

}
