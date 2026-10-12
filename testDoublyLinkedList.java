import java.util.Arrays;

public class testDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList linkedList = new DoublyLinkedList();
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
        linkedList.printReverse();                  // 1,2,3,4,5,6

        System.out.println(linkedList.remove(3));   // true
        System.out.println(linkedList.remove(8));   // false
        System.out.println(Arrays.toString(linkedList.toArray())); // [6, 5, 4, 2, 1]

        // Pengujian tambahan: hapus head dan tail
        System.out.println(linkedList.remove(6));   // true (head)
        System.out.println(linkedList.remove(1));   // true (tail)
        System.out.println(Arrays.toString(linkedList.toArray())); // [5, 4, 2]
        linkedList.addLast(9);                      // memastikan tail sudah benar
        System.out.println(Arrays.toString(linkedList.toArray())); // [5, 4, 2, 9]
        System.out.println(linkedList.size());      // 4

        // Memastikan pointer prev masih benar setelah semua perubahan
        System.out.println("printReverse setelah perubahan:");
        linkedList.printReverse();                  // 9,2,4,5
    }
}