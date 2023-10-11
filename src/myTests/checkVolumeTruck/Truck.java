package myTests.checkVolumeTruck;

public class Truck extends Car {

    int length;
    int width;
    int height;
    int weight;

    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}
