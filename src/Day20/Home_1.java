package Day20;

import java.util.Scanner;
class Node4{
    int data;
    Node next;
    Node4(int data){
        this.data = data;
        this.next = next;
    }
}
public class Home_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        Node head = null, tail = null;
        while(sc.hasNextInt()){
            int val = sc.nextInt();
            if(val == -1) break;
            Node newNode = new Node(val);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node curr = head;
        while(curr != null){
            for(int count = 1; count < M && curr != null;count++){
                curr = curr.next;
            }
            if(curr == null)break;
            Node t = curr.next;
            for(int count=1;count<=N&&t!=null;count++){
                t = t.next;
            }
            curr.next = t;
            curr = t;
        }
        curr = head;
        while(curr != null){
            System.out.print(curr.data);
            if(curr.next != null){
                System.out.print("->");
            }
            curr = curr.next;
        }
    }
}
