public class ResidentialSite extends Site{

    public ResidentialSite(double units, double rate){
        super(units, rate);
    }


    public double getBaseAmount(){
        return this.getUnits() * this.getRate();
    }

    public double getTax(){
        return this.getBaseAmount() * Site.TAX_RATE;
    }
}
