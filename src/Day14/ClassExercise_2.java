package Day14;

import java.util.*;

class MobilePlan {
    double calculateCost(double dataUsage, int callMinutes, int textMessages) {
        return 0;
    }

    String getPlanName() {
        return "";
    }

    static MobilePlan createPlan(String useType) {
        if (useType.equalsIgnoreCase("High")) {
            return new HighUsagePlan();
        } else {
            return new LowUsagePlan();
        }
    }
}

class HighUsagePlan extends MobilePlan {
    double calculateCost(double dataUsage, int callMinutes, int textMessages) {
        return (dataUsage * 5) + (callMinutes * 0.2) + (textMessages * 0.1);
    }

    String getPlanName() {
        return "High Usage Plan";
    }
}

class LowUsagePlan extends MobilePlan {
    double calculateCost(double dataUsage, int callMinutes, int textMessages) {
        return (dataUsage * 1.5) + (callMinutes * 0.1) + (textMessages * 0.02);
    }

    String getPlanName() {
        return "Low Usage Plan";
    }
}

class ClassExercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usageType = scanner.next();
        double dataUsage = scanner.nextDouble();
        int callMinutes = scanner.nextInt();
        int textMessages = scanner.nextInt();

        MobilePlan plan = MobilePlan.createPlan(usageType);

        System.out.printf("Plan Type: %s\n", plan.getPlanName());
        System.out.printf("Total Cost: %.2f\n",
                plan.calculateCost(dataUsage, callMinutes, textMessages));

        scanner.close();
    }
}
