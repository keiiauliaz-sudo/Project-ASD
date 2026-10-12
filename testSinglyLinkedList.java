import java.util.Arrays;

public class testSinglyLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);

        System.out.println(linkedList.get(2));      // 4
        try {
            System.out.println(linkedList.get(12)); // exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(linkedList.indexOf(4));  // 2
        System.out.println(linkedList.indexOf(10)); // -1

        System.out.println("printReverse:");
        linkedList.printReverse();                

        System.out.println(linkedList.remove(3));  
        System.out.println(linkedList.remove(8));   
        System.out.println(Arrays.toString(linkedList.toArray())); 

        System.out.println(linkedList.remove(6));  
        System.out.println(linkedList.remove(1));  
        System.out.println(Arrays.toString(linkedList.toArray())); 
        linkedList.addLast(9);                    
        System.out.println(Arrays.toString(linkedList.toArray())); 
        System.out.println(linkedList.size());    
    }
}