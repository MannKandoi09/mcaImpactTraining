package Day14;

// You are using Java
import java.util.*;

class Team{
    private int totalScore;
    Team(){
        totalScore = 0;
    }

    void addScore(int runs){
        if(runs > 0){
            totalScore += runs;
        }else{
            System.out.println("Runs must be positive.");
        }
    }
    int getTotalScore(){
        return totalScore;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int runs1 = sc.nextInt();
        int runs2 = sc.nextInt();

        Team team = new Team();
        team.addScore(runs1);
        System.out.println("Current Total Score: " + team.getTotalScore());

        team.addScore(runs2);
        System.out.println("Updated Total Score: " + team.getTotalScore());
    }
}

