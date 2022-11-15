import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada",
                "Granta",
                2015,
                "Russia",
                "sedan",
                4,
                1.6f,
                "Желтый",
                "automat",
                "A408KY777",
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(3),
                        1000f,
                        "3232232"));

        if (!ladaGranta.getInsurance().isInsuranceValid()) {
            System.out.println("Продлите страховку");
        } else {
            System.out.println("Со страховкой все ОК");
        }

        // Не работает проверка номера
        if (!ladaGranta.isRegNumberValid()) {
            System.out.println("Номер некорректный");
        } else {
            System.out.println("Номер корректный");
        }

        System.out.println(ladaGranta);
        System.out.println();

        Train lastochka = new Train("Ласточка",
                "B-901", 2011,
                "Россия", "",
                3500f,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                301f,
                11);

        Train leningrad = new Train("Ленинград",
                "D-125", 2019,
                "Россия", "",
                1700f,
                "Ленинградский вокзал",
                "Ленинград-Пассажирский",
                270f,
                8);

        System.out.println(lastochka);
        System.out.println(leningrad);

        Bus bus1 = new Bus("Автобус 1", "1233", 2016, "Россия", "");
        Bus bus2 = new Bus("Автобус 2", "1232", 2013, "Белоруссия", "Синий");
        Bus bus3 = new Bus("Автобус 3", "1235", 2020, "Россия", "Желтый");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        ladaGranta.refill();
        lastochka.refill();
        bus1.refill();

    }


}