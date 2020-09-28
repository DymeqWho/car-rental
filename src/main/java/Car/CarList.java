package Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class CarList {
    Scanner scanner = new Scanner(System.in);
    Car car1 = new Car("Opel", "Corsa", 58965, LocalDate.of(2015, 4, 15), BigDecimal.valueOf(80));
    Car car2 = new Car("Skoda", "Fabia", 45896, LocalDate.of(2016, 6, 15), BigDecimal.valueOf(110));
    Car car = new Car(" ", " ", 0, LocalDate.of(1900, 1, 1), BigDecimal.ZERO);

    private Car[] carsNotRentedList = new Car[100];

    Car[] carsThatHaveBeenRented = new Car[100];

    public void setCarsNotRentedList(Car[] carsNotRentedList) {

        this.carsNotRentedList = carsNotRentedList;
    }

    public Car[] getCarsNotRentedList() {
     carsNotRentedList[0] = car1;
     carsNotRentedList[1] = car2;
        return carsNotRentedList;
    }

    public Car[] createListOfNotRentedCars() {
        for (int i = 0; i < carsNotRentedList.length; i++) {
            if (carsNotRentedList[i] == null) {
                carsNotRentedList[i] = car.createNewCar();
                break;
            }
        }
        return carsNotRentedList;
    }


}


