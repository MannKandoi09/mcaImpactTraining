package Day21;

import java.util.Scanner;
public class DailyChallange{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;

        for(int i = 0; i < n; i++){
            Node newNode = new Node(sc.nextInt());
            newNode.next = head;
            head = newNode;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        if(slow != null){
            System.out.println("Middle Element: " + slow.data);
        }
    }
}