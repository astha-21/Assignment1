import java.util;

public class Question_11 {
 
 public static void main(String[] args) {
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(11,"Chaitanya");
    hashmap.put(22,"Pratap");
    hashmap.put(33,"Singh");
    hashmap.put(44,"Rajesh");
    hashmap.put(55,"Kate");

    boolean flag = hashmap.containsKey(22);
    System.out.println("Key 22 exists in HashMap? : " + flag);
 
    boolean flag2 = hashmap.containsKey(55);
    System.out.println("Key 55 exists in HashMap? : " + flag2);
 
    boolean flag3 = hashmap.containsKey(99);
    System.out.println("Key 99 exists in HashMap? : " + flag3);
 }
}