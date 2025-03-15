public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,  boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100)
                ? tonerLevel : -1;
        this.duplex = duplex;
    }
    /*
    I'll leave pagesPrinted out of the constructor because that would
    normally be managed by this class and not passed in when I create
    a new printer.
    I don't have to set pages printed to zero because that's the default
    value for an instance field that's an integer, but you can always
    specify it for clarity.


     */

    public int addToner(int tonerAmount) {

    }


    public int printPages(int pages) {

    }
}
