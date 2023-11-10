public class Site {
    private double units;
    private double rate;
    final public static double TAX_RATE  = 0.13;

    public Site(double units, double rate){
        this.units = units;
        this.rate = units;
    }

    public double getUnits(){
        return this.units;
    }

    public double getRate(){
        return this.rate;
    }

    public static double getBillableAmount(double base, double tax) {
        return base + tax;
    }
}
