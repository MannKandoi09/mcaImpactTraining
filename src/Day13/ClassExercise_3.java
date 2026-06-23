package Day13;

class ClassExercise_3{
    static final double EUR_RATE = 0.88;
    static final double GBP_RATE = 0.75;

    double convert(String currency, double amount){
        if(currency.equals("EUR")){
            return amount * EUR_RATE;
        }else{
            return amount * GBP_RATE;
        }
    }
}