package Car;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    CarList carList = new CarList();

    public void Menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("*** Welcome to car rental! ***");
        System.out.println();
        System.out.println("1.  List of available cars: ");
        System.out.println("2.  Edit rental price: ");
        System.out.println("3.  Add new car: ");
        System.out.println("4.  List active users: ");
        System.out.println("5.  Add user: ");
        System.out.println("6.  Activate a user: ");
        System.out.println("7.  Rent a car: ");
        System.out.println("8.  List all rented cars: ");
        System.out.println("9.  Return a car: ");
        System.out.println("10. Display monthly report: ");
        System.out.println("11. Display yearly report: ");
        System.out.println("12. Exit.");
        System.out.println();
        System.out.print("Choose your option: ");
        //this number will show, when picked on console
        int choise;
        // number of iteration necessary for console menu.
        int i = 0;
        do {
            // there is place, where console is asking for pick number.
            choise = scanner.nextInt();

            if (choise == 1) {
                System.out.println(Arrays.toString(carList.getCarsNotRentedList()));
            } else if (choise == 2) {
                System.out.println("2.");
            } else if (choise == 3) {
                System.out.println(carList.createListOfNotRentedCars());
            } else if (choise == 4) {
                System.out.println("4.");
            } else if (choise == 5) {
                System.out.println("5.");
            } else if (choise == 6) {
                System.out.println("6");
            } else if (choise == 7) {
                System.out.println("7.");
            } else if (choise == 8) {
                System.out.println("8.");
            } else if (choise == 9) {
                System.out.println("9");
            } else if (choise == 10) {
                System.out.println("10");
            } else if (choise == 11) {
                System.out.println("11");
            } else if (choise == 12) {
                System.out.println("12");
            } else {
                System.out.println("Wrong number! Choose another: ");
            }
            i++;
        } while (choise <= 0 || choise > 12); // console will not ask about different number while number will be between 1-12.
    }
}
