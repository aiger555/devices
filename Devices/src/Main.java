import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between devices (1-20): ");
        int num = scanner.nextInt();
        scanner.close();

        if (num < 1 || num > 20){
            System.out.println("Error! Enter number only between 1 to 20 including: ");
            return;
        }

        String[] dtype = {"Smartphone", "Laptop", "Tablet"};

        List<Device> devices = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int dindex = random.nextInt(dtype.length);
            String type = dtype[dindex];
            double price = 100 + random.nextDouble() * 1900;
            double weight = 200 + random.nextDouble() * 1800;

            Device device = createDevice(type, price, weight, random);
            devices.add(device);
        }

        double tprice = totalprice(devices);
        double tweight = totalweight(devices);

        System.out.println("Number of distinct device types created: " + dtype.length);
        System.out.println("Total price of all devices: $" + tprice);
        System.out.println("Total weight of all devices: " + tweight + " grams");
    }
    
    public static Device createDevice(String type, double price, double weight, Random random) {
        if (type.equals("Smartphone")) {
            double screenSize = 4.0 + random.nextDouble() * 5.0;
            int cameraResolution = 5 + random.nextInt(16);
            return new Smartphone(type, price, weight, screenSize, cameraResolution);
        } else if (type.equals("Laptop")) {
            String[] models = {"Acer", "Lenovo", "MacOS", "lenovo Pro"};
            String model = models[random.nextInt(models.length)];
            int memory = 4 + random.nextInt(13);
            return new Laptop(type, price, weight, model, memory);
        } else {
            String[] p = {"China", "USA", "KG"};
            String production = p[random.nextInt(p.length)];
            return new Tablet(type, price, weight, production);
        }
    }


    public static double totalprice(List< Device > devices) {
        double totalprices = 0.0;
        for (Device device : devices) {
            totalprices += device.getPrice();
        }
        return totalprices;
    }

    public static double totalweight(List< Device > devices) {
        double totalweights = 0.0;
        for (Device device : devices) {
            totalweights += device.getWeight();
        }
        return totalweights;
    }
}
