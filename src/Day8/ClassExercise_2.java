package Day8;

import java.util.ArrayList;
import java.util.Scanner;

class NameManager {
    ArrayList<String> names = new ArrayList<>();

    public void addName(String name){
        names.add(name);

    }
    public void printNameAtIndex(int index){
        if(index >= 0 && index < names.size()){
            System.out.print("Element at index " + index + ": " + names.get(index));
        }
        else{
            System.out.print("Invalid index");
        }
    }
}

public class ClassExercise_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NameManager manager = new NameManager();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            manager.addName(sc.nextLine());
        }
        int index = sc.nextInt();
        manager.printNameAtIndex(index);
        sc.close();
    }
}