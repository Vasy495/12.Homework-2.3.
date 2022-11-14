package transport;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int year;
    private final String country;

    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seats;
    private boolean season;
    public String defaultValue = "Информация не передана";
    private final Key key;
    private final Insurance insurance;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUtil;
        private final float cost;
        private final String number;

        public Insurance(LocalDate validUtil, float cost, String number) {
            this.validUtil = validUtil != null ? validUtil : LocalDate.now().plusDays(10);
            this.cost = Math.max(cost, 1f);
            this.number = validationU(number, "default");
        }

        public boolean isNumberValid(){
            return number.length() == 9;}

        public  boolean isInsuranceValid(){
            return LocalDate.now().isBefore(this.validUtil);
        }
    }

    public Car(String brand,
               String model,
               int year,
               String country,
               String bodyType,
               int seats,
               float engineVolume,
               String color,
               String transmission,
               String registrationNumber,
               boolean season,
               Key key,
               Insurance insurance) {
        this.brand = validationU(brand, defaultValue);
        this.model = validationU(model, defaultValue);
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        this.country = validationU(country, defaultValue);
        this.bodyType = validationU(bodyType, defaultValue);
        this.seats = Math.max(seats, 0);
        this.key = key;
        this.insurance = insurance;

        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegistrationNumber(registrationNumber);
        setSeason(season);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +
                ", " + getYear() +
                " год выпуска, сборка в " + getCountry() +
                ", цвет кузова - " + getColor() +
                ", объем двигателя - " + getEngineVolume() +
                " л. Коробка передач - " + getTransmission() +
                ". Тип кузова - " + getBodyType() +
                ". Регистрационный номер - " + getRegistrationNumber() +
                ". Количество мест - " + getSeats() +
                ". Резина - " + getSeason();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validationU(color, "Белый");
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = validationU(transmission, defaultValue);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {

        this.registrationNumber = registrationNumber;
    }

    public boolean getSeason() {
        return season;
    }

    public void setSeason(boolean season) {
        int currentMonth = LocalDate.now().lengthOfMonth();
        this.season = currentMonth <= 4 || currentMonth >= 11;
    }

    public boolean isRegNumberValid() {
        if (this.registrationNumber.length() != 9) {
            return false;
        }
        char[] regNumberChar = this.registrationNumber.toCharArray();
        return isNumberLetter(regNumberChar[0])
                && isNumberLetter(regNumberChar[1])
                && isNumber(regNumberChar[2])
                && isNumber(regNumberChar[3])
                && isNumber(regNumberChar[4])
                && isNumberLetter(regNumberChar[5])
                && isNumberLetter(regNumberChar[6])
                && isNumber(regNumberChar[7])
                && isNumber(regNumberChar[8])
                && isNumber(regNumberChar[9]);
    }

    private boolean isNumber(char symbol) {
        return Character.isDigit(symbol);
    }

    private boolean isNumberLetter(char symbol) {
        String allowedSymbols = "ABEKMHOPCTYX";
        return allowedSymbols.contains("" + symbol);
    }
    public static String validationU(String value, String defaultValue) {
        return value == null || value.isBlank() ? defaultValue : value;
    }

    public boolean isSeason() {
        return season;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
