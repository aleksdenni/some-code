package myTests.checkVolumeTruck;

public class TestClass {

    public static void main(String[] args) {
        Truck first = new Truck();
        first.weight = 10000;
        Truck second = new Truck();
        second.weight = 20000;

        Checker сhecker = new Checker(15000);
        System.out.println("Вантажівка номер 1! Можу я проїхать, офіцер?");
        сhecker.checkTruck(first);

        System.out.println();

        System.out.println("Вантажівка номер 2! А мені можна?");
        сhecker.checkTruck(second);
    }
}
