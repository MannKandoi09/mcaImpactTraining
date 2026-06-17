package Day8;

import java.util.Scanner;
import java.util.*;

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        StringListOperations.processCommands(input);
//        sc.close();
//    }
//}

// You are using Java
class ClassExercise_3{
    public static void processCommands(String input){
        if(input == null || input.trim().isEmpty()) return;

        String[] tokens = input.trim().split("\\s+");
        ArrayList<String> list = new ArrayList<>();

        int i = 0;
        while(i < tokens.length){
            String choice = tokens[i++];

            if(choice.equals("1")){
                if(i < tokens.length){
                    String item = tokens[i++];
                    list.add(item);
                    System.out.println(item + " has been added to the list.");
                }
            }else if(choice.equals("2")){
                if(i < tokens.length){
                    String item = tokens[i++];
                    if(list.remove(item)){
                        System.out.println(item + " has been removed from the list.");
                    }else{
                        System.out.println(item+ " not found in the list.");
                    }
                }
            }else if(choice.equals("3")){
                if(list.isEmpty()){
                    System.out.println("The list is empty.");
                }else{
                    System.out.println("Items in the list:");
                    for(String s : list){
                        System.out.println(s);
                    }
                }
            }else if(choice.equals("4")){
                if(i < tokens.length){
                    String item = tokens[i++];
                    if(list.contains(item)){
                        System.out.print(item +" is found in the list.");
                    }else{
                        System.out.println(item + " not found in the list.");
                    }
                }
            }
        }
    }
}
