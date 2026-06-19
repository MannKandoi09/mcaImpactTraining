package Day11;

// You are using Java
import java.util.Scanner;
public class ClassExercise_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int count = 1;

        for(int i = 0; i < str.length(); i++){
            if(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;
            }
        }


    }
}