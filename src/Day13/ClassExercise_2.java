package Day13;

class SpeedConverter{
    static final double CONVERSION = 1.60934;

    String convertSpeed(int choice, double speed){
        if(choice == 1){
            return String.format("%.2f", speed * CONVERSION);
        }
        else if(choice == 2){
            return String.format("%.2f", speed  / CONVERSION);
        }else{
            return String.format("Invalid choice");
        }
    }
}
