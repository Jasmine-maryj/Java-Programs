package ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i);
            list2.add(i);
        }

        System.out.println(list1);
        System.out.println(list2);
        
        System.out.println(list1.contains(3));
        
        System.out.println(list1.isEmpty());
        System.out.println(list1.get(2));
        
        list1.add(4, 6);
        
        list1.set(0, 0);
        
        list1.remove(5);
        list1.remove(2);
        
        
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
        
        for(int ele: list1){
            System.out.println(ele);
        }
        list1.add(2, 10);
        
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
    }
}
