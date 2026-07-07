package Day22;

import java.util.Scanner;
public class  DailyChallange{
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = null, tail = null;
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            if(input == null)break;
            input = input.trim();

            if(input.equalsIgnoreCase("exit")) break;
            if(input.isEmpty()) continue;

            Node newNode = new Node(input);
            if(head == null){
                head = newNode;
                tail = newNode;
                tail.next = head;
            }else{
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
            System.out.println("Circular Linked List - Running Applications");
            if(head == null){
                System.out.println("No applications to iterate.");
            }else{
                System.out.println("Running Applications:");
                Node temp = head;
                do{
                    System.out.println(temp.data);
                    temp = temp.next;
                }while(temp != head);
            }
        }
    }
}