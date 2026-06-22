package Day12;

// You are using Java
import java.util.*;
public class ClassExercise_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        int lines = 0;
        int words = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            if(line.equals("END")){
                break;
            }
            text.append(line).append("\n");
            lines++;


            String trimed = line.trim();
            if(!trimed.isEmpty()){
                words += trimed.split("\\s+").length;
            }
        }
        int characters = text.length();

        System.out.println("Number of characters: " + characters);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of words: " + words);

    }
}