package Macias260.training;


public class App {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car car1 = new Car("AUDI");

        Bridge bridge = new Bridge(car);
        Bridge bridge1 = new Bridge(car1);


        bridge.crossTheBridge();
        bridge1.crossTheBridge();



    }
}
