import java.sql.SQLOutput;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");

    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");

    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

}

  /*
  Protected means my subclasses can override it, but any other classes
  not sharing the same package, can't.

  Note:  I didn't have to include This.getClass, the this keyword is implied.
  The statement calls the method on the currently executing instance even
  without the use of the this keyword.

   */

class GasPoweredCar extends Car  {
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinder are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}