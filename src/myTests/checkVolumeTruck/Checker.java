package myTests.checkVolumeTruck;

public class Checker {
    int maxWeight;

    public Checker(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            System.out.println("Розвертайся, перегруз!");
            return false;
        } else {
            System.out.println("Порядок, проїжджай!");
            return true;
        }
    }
}
