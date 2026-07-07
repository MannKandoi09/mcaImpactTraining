package Day21;

import java.util.Scanner;
public class Class_3{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        Node head = null, tail = null;
        for(int i = 0; i < n; i++){
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head =  newNode;
            }else{
                tail.next = newNode;
            }
            tail = newNode;
            tail.next = head;
        }
        System.out.print("Before Swap: ");
        printList(head, n);

        if(head != null && tail != null && head != tail){
            int temp = head.data;
            head.data = tail.data;
            tail.data = temp;
        }
        System.out.print("After Swap: ");
        printList(head, n);

    }
    static void printList(Node head, int n){
        Node temp = head;
        for(int i = 0; i < n; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}