package Day11;

// You are using Java
import java.util.Scanner;
public class ClassExercise_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();


        String[] words = str.split(" ");
        int count = 0;
        for(String w : words){
            w = w.replaceAll("[^a-zA-Z]","");
            if(w.equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}