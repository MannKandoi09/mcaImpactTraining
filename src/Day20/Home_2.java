package Day20;

import java.util.Scanner;
class Node5{
    int data;
    Node next;
    Node5(int data){
        this.data = data;
        this.next = null;
    }
}
public class Home_2{
    static Node head = null;

    public static void insertAtBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void insertAtPosition(int pos,int data){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for(int i = 1; temp != null && i < pos - 1; i++){
            temp = temp.next;
        }
        if(temp != null){
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public static void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + (temp.next != null?
                    " " : ""));
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int choice = sc.nextInt();
            if(choice  == 1){
                int data = sc.nextInt();
                insertAtBegin(data);
            }else if(choice == 2){
                int data = sc.nextInt();
                insertAtEnd(data);
            }else if(choice == 3){
                int pos = sc.nextInt();
                int data = sc.nextInt();
                insertAtPosition(pos,data);
            }else if(choice == 4){
                printList();
            }else if(choice == 5){
                System.out.println("Exiting");
                break;
            }else{
                System.out.println("Wrong choice");

            }
        }

    }
}