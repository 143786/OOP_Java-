public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product{

    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size,
         String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format(
                "Drawing pixel at %d, %d in color %s ", x, y, color
        ));

    }

}

class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots,
          int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");

    }
}

class ComputerCase extends Product{

    private String powerSupply;
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer,
                        String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");

    }
}

/*          Monitor class has got a relationship with product, meaning
        that a monitor can be said to be a type of product.
        That's the relationship between the two classes.
        And I can quite correctly say that all three of these parts,
        (monitor, motherboard, computerCase ) are all types of product.
        And that's essentially what inheritance is.

        Inheritance vs composition :
        Inheritance defines an IS A relationship.
        Composition defines a HAS A relationship.

        next, let's look at how I'd use composition to create a
        personal computer.
        Composition is actually modeling parts, and those parts make
        up a greater whole.
        In this case, I'm going to model the personal computer.
        And I'm modeling the HAS A relationship with the motherboard,
        the case, and the monitor.






 */