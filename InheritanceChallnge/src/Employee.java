public class Employee extends Worker {

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;
    /*
    Static field is a place that lets you share data among all
    your instance. When we're generating an ID for a new employee,
    it's a place to find the next ID to use.
    */



    public Employee(String name, String birthDate,
                    String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
