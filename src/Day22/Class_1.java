package Day22;

import java.util.*;
class Main{
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

    static Node merge(Node a, Node b){
        if(a == null)return b;
        if(b == null)return a;
        Node head;
        if(a.data <= b.data){
            head = a;
            a = a.next;
        }else{
            head = b;
            b = b.next;
        }
        Node t = head;
        while(a != null && b != null){
            if(a.data <= b.data){
                t.next = a;
                a= a.next;
            }else{
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        t.next = (a != null)? a : b;
        return head;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node h1 = null;
        for(int i = 0; i< n; i++) h1 = insert(h1, sc.nextInt());

        int m = sc.nextInt();
        Node h2 = null;
        for(int i = 0; i < m; i++) h2 = insert(h2, sc.nextInt());

        Node ans = merge(h1,h2);
        while(ans != null){
            System.out.print(ans.data + " ");
            ans = ans.next;
        }
    }

}

