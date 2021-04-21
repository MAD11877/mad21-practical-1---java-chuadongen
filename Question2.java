import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    //System.out.println("Enter height: ");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    //System.out.println("Enter weight: ");
    double weight = in.nextDouble();
    in.close();
    double bmi = weight / (height*height);
    System.out.println(bmi);
  }
}
