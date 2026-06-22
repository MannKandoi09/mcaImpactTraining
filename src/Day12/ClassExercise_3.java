package Day12;
import java.util.*;
public class ClassExercise_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String sub = sc.nextLine();
        int pos = sc.nextInt();

        StringBuilder sb = new StringBuilder(str);
        sb.insert(pos, sub);
        System.out.print(sb);

    }
}