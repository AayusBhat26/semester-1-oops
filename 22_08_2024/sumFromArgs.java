public class sumFromArgs{
      public static void main(String args[]){
            String first = args[0];
            String second = args[1];
            int sum = Integer.parseInt(first) + Integer.parseInt(second);
            System.out.println("Sum of " + first + " and " + second + " is: "+ sum);
      }
}
