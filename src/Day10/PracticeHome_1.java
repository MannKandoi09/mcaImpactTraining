package Day10;

// You are using Java
import java.util.Scanner;
public class PracticeHome_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores =  new int[n];


        for(int i = 0; i < n; i ++){
            scores[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int count = 0;
        int secondIndex = -1;

        for(int i = 0; i < n; i++){
            if(scores[i] == x){
                count++;
                if(count == 2){
                    secondIndex = i;
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println(x + " Score not found");
        }else if(count == 1){
            System.out.println(x + " Score found only once");
        }else{
            System.out.println(secondIndex);
        }

    }
}
