public class Main {
    public static void main(String[] args) {

        int number = 101;
        for (int i = 1; i < number; i++)
          if (i % 3 == 0 && i % 5 != 0)
          {
            System.out.println("Fizz");
          }
         else if (i % 5 == 0 && i % 3 != 0)
          {
            System.out.println("Buzz");
          }
         else if (i % 3 == 0 && i % 5 == 0)
          {
            System.out.println("FizzBuzz");
          }
         else
            System.out.println(i);
    }
}