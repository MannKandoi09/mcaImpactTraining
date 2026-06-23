package Day13;

// You are using Java
import java.util.*;
class CricketPlayer{
    private String name;
    private double avergaeScore;

    public CricketPlayer(String name, double avergaeScore){
        this.name = name;
        this.avergaeScore = avergaeScore;
    }
    public String getname(){
        return name;
    }
    public double  getAverageScore(){
        return avergaeScore;
    }

    public void setAverageScore(double score){
        if(score >= 0){
            avergaeScore = score;
        }else{
            System.out.println("Average score cannot be negative.");
        }
    }
}
public class Home_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double avg = sc.nextDouble();
        double newAvg = sc.nextDouble();

        CricketPlayer player = new CricketPlayer(name, avg);

        System.out.println("Player Name: " + player.getname());
        System.out.println("Initial Average Score: " + player.getAverageScore());

        player.setAverageScore(newAvg);

        System.out.println();
        System.out.println("Updated Player Information:");
        System.out.println("Player Name: " + player.getname());
        System.out.println("Updated Average Score: " + player.getAverageScore());



    }
}