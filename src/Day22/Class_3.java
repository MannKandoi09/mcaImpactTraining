package Day22;

import java.util.*;
class Class_3{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static Node insert(Node head, int x){
        Node n = new Node(x);
        if(head == null) return n;
        Node t = head;
        while(t.next != null) t = t.next;
        t.next = n;
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node head = null;

        for(int i = 0; i < k; i++)
            head = insert(head,sc.nextInt());

        int n = sc.nextInt();
        Node fast = head, slow = head;

        for(int i = 0;i < n; i++){
            if(fast == null){
                System.out.println("Invalid position");
                return;
            }
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }
}

