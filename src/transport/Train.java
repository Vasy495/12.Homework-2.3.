package transport;

public class Train extends Transport {
    private float price;
    private float speedTrain;
    private String nameStartStation;
    private String nameFinalStation;
    private int numberOfWagons;


    public Train(String brand, String model, int year, String country, String color, float price, String nameStartStation, String nameFinalStation, float speedTrain, int numberOfWagons) {
        super(brand, model, year, country, color);
        setPrice(price);
        setNameStartStation(nameStartStation);
        setNameFinalStation(nameFinalStation);
        setSpeedTrain(speedTrain);
        setNumberOfWagons(numberOfWagons);
    }

    public float getPrice() {
        return price;
    }

    public float getSpeedTrain() {
        return speedTrain;
    }

    public String getNameStartStation() {
        return nameStartStation;
    }

    public String getNameFinalStation() {
        return nameFinalStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setPrice(float price) {
        this.price = ValidationUtils.validOfFloatDefault(price, 0);
    }

    public void setSpeedTrain(float speedTrain) {
        this.speedTrain = ValidationUtils.validOfFloatDefault(speedTrain, 0);
    }

    public void setNameStartStation(String nameStartStation) {
        this.nameStartStation = ValidationUtils.validOfDefault(nameStartStation, defaultValue);
    }

    public void setNameFinalStation(String nameFinalStation) {
        this.nameFinalStation = ValidationUtils.validOfDefault(nameFinalStation, defaultValue);
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = ValidationUtils.validOfIntDefault(numberOfWagons, 0);
    }

    @Override
    public void refill() {
        System.out.println("Поезда можно заправлять только дизельным топливом");
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + ", модель " + getModel() + ", год выпуска " + getYear() + ", страна производства " +
                getCountry() + ", скорость передвижения " + getSpeedTrain() + " км/ч, отходит от " + getNameStartStation() +
                " и следует до станции " + getNameFinalStation() + ". Цена поездки " + getPrice() + " рублей, в поезде " +
                getNumberOfWagons() + " вагонов.";
    }
}
