package Day11;

// You are using Java
import java.util.*;
public class Home_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int maxLen = 0;
        String current = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            int index = current.indexOf(ch);
            if(index != -1){
                current = current.substring(index + 1);
            }
            current += ch;
            maxLen = Math.max(maxLen, current.length());
        }
        System.out.print(maxLen);
    }
}