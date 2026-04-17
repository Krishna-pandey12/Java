import java.util.*;

public class Main4 {
  public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(40);
        
        System.out.println("original list:"+list);
        Collections.sort(list);
        System.out.println("Sorted list:"+list);
        Collections.sort(list,Comparator.reverseOrder());
        System.out.println("Reverse Sorted list:"+list);
  }

  
}
