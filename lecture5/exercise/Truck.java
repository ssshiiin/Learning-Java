package exercise;

public class Truck implements Vehicle {
    private int seat;

    @Override
    public void start() {
        System.out.println("Truck starts ...");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops ...");
    }

    public int getSeat() {
        return this.seat;
    }
}