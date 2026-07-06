package Day20;

// You are using Java
import java.util.*;
class Node1{
    int data;
    Node next;
    Node1(int data){
        this.data = data;
    }
}
public class Class_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = null, tail = null;
        for(int i =0; i < n; i++){
            Node temp = new Node(sc.nextInt());
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
        }
        if(head != null){
            if(head.next == null){
                head = null;
            }else{
                Node cur = head;
                while(cur.next.next != null)
                    cur = cur.next;
                cur.next = null;

            }
        }
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}