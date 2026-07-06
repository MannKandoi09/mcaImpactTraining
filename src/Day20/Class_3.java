package Day20;

// You are using Java
import java.util.*;
class Node2{
    int data;
    Node next;
    Node2(int d){
        data = d;
    }
}
public class Class_3{
    static Node head = null;
    static void display(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int ch = sc.nextInt();

            if(ch == 1){
                head = null;
                Node tail = null;
                while(true){
                    int x = sc.nextInt();
                    if(x == -1) break;
                    Node n = new Node(x);
                    if(head == null){
                        head = tail = n;
                    }else{
                        tail.next = n;
                        tail = n;
                    }
                }


                System.out.println("LINKED LIST CREATED");
            }


            else if(ch == 2){
                display();
            }
            else if(ch == 3){
                if(head == null){
                    System.out.println("Operation not  possible");
                    continue;
                }
                int val = sc.nextInt();

                if(head.data == val){
                    System.out.println("No node exists before the value");
                    continue;
                }
                Node p = null, c = head;
                while(c.next != null && c.next.data != val){
                    p = c;
                    c = c.next;
                }
                if(c.next  == null){
                    System.out.println("Value not found in the list");
                }else{
                    if(p == null){
                        head = head.next;
                    }else{
                        p.next = c.next;
                    }
                    System.out.println("The linked list after deletion before a value is: ");
                    display();
                }
            }
            else if(ch == 4){
                if(head == null){
                    System.out.println("Operation not possible");
                    continue;
                }
                int val = sc.nextInt();
                Node t = head;

                while(t != null && t.data != val)
                    t = t.next;

                if(t == null){
                    System.out.println("Operation not possible");
                }else if(t.next == null){
                    System.out.println("No node exists after the value");
                }else{
                    t.next = t.next.next;
                    System.out.println("The linked list after deletion after a value is:");
                    display();
                }
            }
            else if(ch == 5){
                break;
            }
            else{
                System.out.println("Invalid option! Please try again");
            }
        }
    }
}