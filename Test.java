public class Test 
{
   public static void main(String[] args)
   {  
      System.out.println("Hello World");
      printer("hello world and universe");
      
      System.out.println(divider(10,3));
   }
   
   public static void printer(String phrase)
   {
      System.out.println(phrase);
   }
   
   public static float divider(int no1, int no2)
   {
      return no1/(float) no2;
   }
}