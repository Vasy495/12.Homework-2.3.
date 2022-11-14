import transport.Car;

import java.time.LocalDate;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        /*Human maxim = new Human(null, "", -1988, "бренд-менеджер");
        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань",2001, "");

        System.out.println(maxim);
        System.out.println(anna);
        System.out.println(kate);
        System.out.println(artem);
        System.out.println(vladimir);
        System.out.println();*/

        Car ladaGranta = new Car("Lada",
                "Granta",
                2020,
                "Россия",
                "Седан",
                4,
                1.5f,
                "Красный",
                "Автомат",
                "A408AA777",
                true,
                new Car.Key(true, true),
                new Car.Insurance(
                        LocalDate.now().plusMonths(3),
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


        /*Car audiA8 = new Car("Audi", "A8 L TDI quattro", 3.0, "черный", 2020, "Германия");
        Car bmw8 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kiaSportage = new Car("Kia", "Sportage", 2.4, "красный", 2018, "Южная Корея");
        Car hyundaiAvante = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея");*/

        System.out.println(ladaGranta);
       /* System.out.println(audiA8);*/
        /*System.out.println(bmw8);
        System.out.println(kiaSportage);
        System.out.println(hyundaiAvante);*/
        System.out.println();

        //Homework 2.1
        /*Flower roza = new Flower("Роза", "", "Голландия", 35.59f, 6);
        Flower hrizantema = new Flower("Хризантема", "", "", 15.00f, 5);
        Flower pion = new Flower("Пион", "", "Англия", 69.90f, 7);
        Flower gipsophila = new Flower("Гипсофила", "", "Турция", 19.50f, 10);

        System.out.println(roza);
        System.out.println(hrizantema);
        System.out.println(pion);
        System.out.println(gipsophila);

        Bouquet buket = new Bouquet(new Flower[]{roza, hrizantema});
        System.out.println(buket.getCost());
        System.out.println(buket.getLifeSpane());*/

    }
}