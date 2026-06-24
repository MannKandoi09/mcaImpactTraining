package Day14;

import java.util.*;

class Appliance {
    double calculateOptimalTime(double efficiencyRating, double peakCost) {
        return 0;
    }

    static Appliance createAppliance(int choice) {
        if (choice == 1) return new AirConditioner();
        if (choice == 2) return new WashingMachine();
        if (choice == 3) return new Refrigerator();
        return null;
    }
}

class AirConditioner extends Appliance {
    double calculateOptimalTime(double e, double p) {
        return 4 - (e * 0.5) + (p * 0.3);
    }
}

class WashingMachine extends Appliance {
    double calculateOptimalTime(double e, double p) {
        return 2 - (e * 0.4) + (p * 0.25);
    }
}

class Refrigerator extends Appliance {
    double calculateOptimalTime(double e, double p) {
        return 10 - (e * 0.2) + (p * 0.1);
    }
}

class Home_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        double efficiencyRating = scanner.nextDouble();
        double peakCost = scanner.nextDouble();

        Appliance appliance = Appliance.createAppliance(choice);

        if (appliance == null) {
            System.out.println("Invalid choice!");
        } else {
            System.out.printf("%.1f\n",
                    appliance.calculateOptimalTime(efficiencyRating, peakCost));
        }

        scanner.close();
    }
}