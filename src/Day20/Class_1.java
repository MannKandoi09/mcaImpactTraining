package Day20;

// You are using Java
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Class_1{
    public static void main(String[] mann){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;

        for(int i = 0; i < n; i++){
            Node temp = new Node(sc.nextInt());
            temp.next = head;
            head = temp;
        }
        if(head != null){
            head = head.next;
        }
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}