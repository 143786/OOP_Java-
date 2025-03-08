public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }    /* default constructor : it gives my subclass
    a little more flexibility ; I could add getters and setters at
      this point, but I don't really need them. */
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public  int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
        /*
        This method is the one that should be overridden by
        subclasses that can figure out the right pay to return
        based on the type of worker, or other subclass.
         */

    }

    public void terminate(String endDate){
        this.endDate = endDate;
    /*
    This method look like a setter:
    I could've just created a setter, but creating a terminate method
    is a bit clearer for the business logic. In addition, subclass
    might want to override it and add additional code that's specific to
    terminating employment for a certain type of worker.

     */
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
