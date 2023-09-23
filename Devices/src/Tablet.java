public class Tablet extends Device {
    private String production;

    public String getProduction() {
        return production;
    }

    public Tablet(String type, double price, double weight, String production) {
        super(type, price, weight);
        this.production = production;
    }

    public void setProduction(String production) {
        this.production = production;
    }


}
