package Day17;

import java.util.Scanner;
public class DailyChallange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char sd = sc.next().charAt(0);
        char ed = sc.next().charAt(0);

        StringBuilder stuffed = new StringBuilder();
        stuffed.append(sd);

        for(int i =0 ; i < a.length(); i++){
            char ch = a.charAt(i);
            stuffed.append(ch);

            if(ch == sd || ch == ed){
                stuffed.append(ch);
            }
        }
        stuffed.append(ed);
        System.out.println("After stuffing: " + stuffed.toString());
    }
}