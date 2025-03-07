public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake ("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");

        /*
       As I defined these fields as private on the
       car class, and because of that, I can't set
       tha values on any car object I create this
       way.    */
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        targa.setMake ("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("Red");

        targa.describeCar();

    }
}
            /*

            Why I use setter
             */