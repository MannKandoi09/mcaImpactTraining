package Day12;


import java.util.*;
public class Home_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String oldStr = sc.nextLine();
        String newStr = sc.nextLine();
        System.out.println(text);

        StringBuilder sb = new StringBuilder(text);
        int index;
        while((index = sb.indexOf(oldStr)) != -1){
            sb.replace(index, index + oldStr.length(), newStr);
        }
        System.out.print(sb);

    }
}