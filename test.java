import java.util.ArrayDeque;
import java.util.ArrayList;

public class test {
  

    public static void main(String[] args) {
        ArrayDeque<Integer> ans = new ArrayDeque<>();

       ans.add(1);
       ans.add(2);
       ans.add(3);
   
       int x = ans.pollLast();
    //   System.out.println(x);
       System.out.println(x);
    }
}
