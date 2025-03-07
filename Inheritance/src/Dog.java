public class Dog extends Animal  {

    private String earShape; // Dog-specific field.
    private  String tailShape; // Dog-specific field.

    public Dog(){
        super("Mutt", "Big", 50);  // it's similar to this() when we use to call another
        //  constructor in the same class.
    }
    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");

    }

    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" :(weight < 35 ? "medium" : "large")
                , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if (type == "wolf") {
            System.out.print("Ow Wooooo!");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk run and wag their tail");
        if(speed == "slow") {
            walk();
            wagTail();
        } else  {
            run();
            bark();

        }

        System.out.println();
    }

    private void bark() {
        System.out.print("Woof!");
    }

    private void run() {
        System.out.print("Dog Running!");
    }

    private void walk() {
        System.out.print("Dog walking!");
    }

    private void wagTail() {
        System.out.print("Tail Wagging!");
    }
    // These 4 method are our dog behaviors .
}




/*
        Extends :
        Using extends specifies the superclass ( or the parent class)
        of the class we're declaring. I can say Dog is a subclass or
        child class of Animal.
        A class can specify one and only one class in its extends
        clause. ( I'll add that clause to my Dog class.)

        ** super() : it's way to  call the constructor on the parent
        class or super class.

        Code Re-use :
        All subclass can execute methods even though the code is declared on
        the parent class.
        The code doesn't have to be duplicated in each subclass. But it does get
        even better than that. we can use code, out of the box,
        We can use code from the parent. or we can change that code for the subclass.
        I did this with the toString() method.

        The toString method that was called in the doAnimalStuff method of the Main class
        didn't call the animal toString method. It called the dog toString method when animal
        is an instance of a dog.


        Overriding a method :
        When you create a method on a subclass, which has the same signature as a method on a
        super class.
        (method signature consist of the method name and the number and types of parameters )
        You override a parent class method when you want the child class to show different
        behavior for that method.

        @Override : IntelliJ's generation tool adds this ( @Override ) symbol, and that's to
        remind us that we're overriding a method that's in the superclass.
        In this case, it's in the animal class. the automatically generated code simply makes
        a call to the parent class's method, move, using the keyword super and dot move.
        *** The Overridden method : can do one of three things :
            1) It can implement completely different behavior of the parent.
            2) It can simply call the parent class's method, which is somewhat redundant to do.
                this is the default behavior of an inherited method.
            3) Or the method can call the parent class's method and include other code to run
            so it can extend the functionality for the Dog, for that behavior.
 */