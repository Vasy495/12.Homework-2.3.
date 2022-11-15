package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color) {
        super(brand, model, year, country, color);
    }

    @Override
    public void refill() {
        System.out.println("Автобусы можно заправлять безином и дезелем на зваправке");

    }


}
