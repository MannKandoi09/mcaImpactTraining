package Day11;
import java.util.*;
public class Home_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String pattern = sc.nextLine();
        String replcement = sc.nextLine();

        System.out.print(word.replace(pattern, replcement));
    }
}