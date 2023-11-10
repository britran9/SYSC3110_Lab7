public class LifelineSite extends Site{
    public LifelineSite(double units, double rate){
        super(units, rate);
    }

    public double getBaseAmount(){
        return this.getUnits() * this.getRate() * 0.5;
    }
    public double getTax(){
        return this.getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
