package Day22;

import java.util.*;
class Class_2{
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
        while(t.next != null) t= t.next;
        t.next = n;
        return head;
    }

    static Node add(Node a, Node b){
        Node head = null, tail = null;
        int carry = 0;

        while(a != null || b != null || carry != 0){
            int sum = carry;
            if(a != null){
                sum += a.data;
                a = a.next;
            }
            if(b != null){
                sum += b.data;
                b = b.next;
            }
            Node n = new Node(sum % 10);
            carry= sum / 10;
            if(head == null)
                head = tail = n;
            else{
                tail.next = n;
                tail = n;
            }
        }
        return head;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node h1 = null;

        for(int i = 0; i < n; i++)
            h1 = insert(h1,sc.nextInt());

        int m = sc.nextInt();
        Node h2 = null;
        for(int i = 0; i < m; i++)
            h2 = insert(h2,sc.nextInt());
        Node ans = add(h1,h2);

        while(ans != null){
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }
}