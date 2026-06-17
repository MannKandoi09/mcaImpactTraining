package Day8;

// You are using Java
import java.util.*;
public class HomeChallange_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();

        for(int i = 0; i < n; i++){
            words.add(sc.next());
        }
        for(String word : words){
            int vowelCount = 0;

            for(char ch : word.toCharArray()){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelCount++;
                }
            }

            if(vowelCount <= 2){
                System.out.println(word);
            }
        }
    }
}
