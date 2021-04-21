import java.util.Scanner;
import java.util.HashMap;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter no. count: ");
    int count = in.nextInt();

    HashMap<Integer,Integer> nocount = new HashMap<Integer,Integer>();
    for(int i = 0; i<count;i++){
      int y = in.nextInt();
      if(nocount.containsKey(y)){
        int previousvalue = nocount.get(y);
        nocount.replace(y,++previousvalue);
      }else{
        nocount.put(y,1);
      }
 
    }
    int max = 0;
    int maxKey = 0;
    for(int k :nocount.keySet()){
      if(nocount.get(k)>max){
        max = nocount.get(k);
        maxKey= k;
      }
    }
    System.out.println(nocount);
    System.out.println(maxKey);
    in.close();
    
    
  }
}
