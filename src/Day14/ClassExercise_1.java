package Day14;

class Exercise {
    double weeklyHours;

    Exercise(double weeklyHours) {
        this.weeklyHours = weeklyHours;
    }
}

class Diet extends Exercise {
    int dailyCalories;

    Diet(double weeklyHours, int dailyCalories) {
        super(weeklyHours);
        this.dailyCalories = dailyCalories;
    }
}

class Fitness extends Diet {

    Fitness(double weeklyHours, int dailyCalories) {
        super(weeklyHours, dailyCalories);
    }

    void evaluateFitness() {
        double score = weeklyHours * 5 - dailyCalories / 100.0;

        System.out.printf("Fitness Score: %.1f%n", score);

        if (score > 20.0) {
            System.out.println("Status: Fit");
        } else {
            System.out.println("Status: Needs Improvement");
        }
    }
}

class ClassExercise_1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        double w = sc.nextDouble();
        int d = sc.nextInt();

        Fitness member = new Fitness(w, d);
        member.evaluateFitness();
    }
}