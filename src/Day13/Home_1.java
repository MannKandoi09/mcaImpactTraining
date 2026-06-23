package Day13;

// You are using Java
class Temperature{
    private double value;
    private String inScale, outScale;

    public void setInput(double value, String inScale, String outScale){
        this.value = value;
        this.inScale = inScale.toUpperCase();
        this.outScale = outScale.toUpperCase();

    }
    public double convert(){
        double c;
        if(inScale.equals("C")){
            c = value;
        }else if (inScale.equals("F")){
            c = (value - 32) * 5 / 9;
        }else{
            c = value - 273.15;
        }

        if(outScale.equals("C")){
            return c;
        }else if (outScale.equals("F")){
            return c * 9 / 5 + 32;
        }else{
            return c + 273.15;
        }
    }
}
