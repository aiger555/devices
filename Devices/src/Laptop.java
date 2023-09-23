public class Laptop extends Device {

    private int memory;
    private String model;

    public Laptop(String type, double price, double weight, String model, int memory) {
        super(type, price, weight);
        this.memory = memory;
        this.model = model;
    }


    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}