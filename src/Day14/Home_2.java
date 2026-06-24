package Day14;

import java.util.*;

abstract class WasteManagement {
    abstract double calculateDisposalCost(double w, double c, double d);

    static WasteManagement createWaste(int t) {
        if (t == 1) return new HouseholdWaste();
        if (t == 2) return new RestaurantWaste();
        if (t == 3) return new IndustrialWaste();
        return null;
    }
}

class HouseholdWaste extends WasteManagement {
    double calculateDisposalCost(double w, double c, double d) {
        return (2.0 + w + c) * d;
    }
}

class RestaurantWaste extends WasteManagement {
    double calculateDisposalCost(double w, double c, double d) {
        return (3.0 + w + c) * d;
    }
}

class IndustrialWaste extends WasteManagement {
    double calculateDisposalCost(double w, double c, double d) {
        return (6.0 + w + c) * d;
    }
}

class Home_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wasteType = scanner.nextInt();
        double weight = scanner.nextDouble();
        double fixedCharges = scanner.nextDouble();
        double discount = scanner.nextDouble();

        WasteManagement wm = WasteManagement.createWaste(wasteType);

        if (wm == null)
            System.out.println("Invalid waste type");
        else
            System.out.printf("%.2f\n",
                    wm.calculateDisposalCost(weight, fixedCharges, discount));

        scanner.close();
    }
}