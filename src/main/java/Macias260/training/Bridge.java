package Macias260.training;

public class Bridge {
    private Car car;

    public Bridge() {
    }

    public Bridge(Car car) {
        this.car = car;
    }

     void crossTheBridge() {
        System.out.println(car.getCarName() + " approaches the bridge.");
        try {
            Thread.sleep(7000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(car.getCarName() + " is crossing the bridge");
        try {
            Thread.sleep(4500);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(car.getCarName() + " left the bridge.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println();
    }
}

