package Day11;

// You are using Java
import java.util.Scanner;
public class ClassExercise_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);

        if(s.equalsIgnoreCase(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}