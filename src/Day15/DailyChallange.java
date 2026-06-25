package Day15;

// You are using Java
abstract class ShippingPlan{
    abstract double calculateCost(int weight, int zone);
}

class EconomyShipping extends ShippingPlan{
    double calculateCost(int weight, int zone){
        if(weight <= 10){
            return weight * 5.0;
        }else{
            return (10 * 5.0) + ((weight - 10) * 3.0);
        }
    }
}

class PriorityShipping extends ShippingPlan{
    double calculateCost(int weight, int zone){
        double cost = 20.0;
        if(weight > 5){
            cost += (weight - 5) * 5.0;
        }
        if(zone >= 3){
            cost += 10.0;
        }
        return cost;
    }
}

class OvernightShipping extends ShippingPlan{
    double calculateCost(int weight, int zone){
        double cost = 50.0 + (weight * 8.0);
        if(weight > 15){
            cost += 20.0;
        }
        return cost;
    }
}