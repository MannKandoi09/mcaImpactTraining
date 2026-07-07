package Day21;

import java.util.Scanner;
public class Class_2{
    static class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null, tail = null;

        for(int i = 0; i < n; i++){
            Node newNode = new  Node(sc.nextInt());
            if(head == null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        if(tail != null){
            if(head == tail){
                head  = tail = null;
            }else{
                tail = tail.prev;
                tail.next.prev = null;
                tail.next = null;
            }
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}