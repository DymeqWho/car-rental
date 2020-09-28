package Car;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

public class Car {

    Scanner scanner = new Scanner(System.in);
    private String mark;
    private String model;
    private int millage;
    private LocalDate dateOfProduction;
    private BigDecimal rentalPriseForOneDay;

    public Car(String mark, String model, int millage, LocalDate dateOfProduction, BigDecimal rentalPriseForOneDay) {
        this.mark = mark;
        this.model = model;
        this.millage = millage;
        this.dateOfProduction = dateOfProduction;
        this.rentalPriseForOneDay = rentalPriseForOneDay;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public BigDecimal getRentalPriseForOneDay() {
        return rentalPriseForOneDay;
    }

    public void setRentalPriseForOneDay(BigDecimal rentalPriseForOneDay) {
        this.rentalPriseForOneDay = rentalPriseForOneDay;
    }

    public Car createNewCar() {
        Car car = new Car(" ", " ", 0, LocalDate.of(1900, 1, 1), BigDecimal.ZERO);
        System.out.print("Podaj markę samochodu: ");
        car.setMark(scanner.nextLine());
        System.out.print("Podaj model samochodu: ");
        car.setMark(scanner.nextLine());
        System.out.print("Podaj przebieg samochodu w [km]: ");
        car.setMillage(scanner.nextInt());
        System.out.print("Podaj datę produkcji w formacie \"rok <spacja> miesiąc <spacja> dzień:\" ");
        car.setDateOfProduction(LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
        System.out.print("Podaj cenę za dobę wynajmu: ");
        car.setRentalPriseForOneDay(BigDecimal.valueOf(scanner.nextDouble()));

        return car;
    }


}
