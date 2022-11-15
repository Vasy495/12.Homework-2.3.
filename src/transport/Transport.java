package transport;

public abstract class Transport {
    private String brand;
    private String model;
    private String color;
    private final int year;
    private final String country;
    public String defaultValue = "Информация не задана";

    public Transport(String brand,
               String model,
               int year,
               String country,
               String color)
    {
        setBrand(brand);
        setModel(model);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = ValidationUtils.validOfDefault(country, defaultValue);
        setColor(color);
    }

    public abstract void refill();


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOfDefault(brand, defaultValue);
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOfDefault(model, defaultValue);
    }

    public void setColor(String color) {
        this.color = ValidationUtils.validOfDefault(color, "Белый");
    }

    @Override
    public String toString() {
        return "Бренд - " + getBrand() +
                ", модель - " + getModel() +
                ", цвет - " + getColor() +
                ", год производства - " + getYear() +
                ", страна производства - " + getCountry();
    }
}
