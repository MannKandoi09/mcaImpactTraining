package Day12;


import java.util.*;
public class ClassExercise_2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);

        String result = str.replace(String.valueOf(ch), "");
        if(result.isEmpty())
            System.out.println(" ");
        else
            System.out.println(result);

    }
}