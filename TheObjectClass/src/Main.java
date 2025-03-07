public class Main extends Object {

    public static void main(String[] args) {

        student max = new student("Max", 22);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 10,
                "Carol");
        System.out.println(jimmy);



    }
}

class student {
    private String name;
    private int age;

    student(String name, int age) {
       this.name = name;
       this.age = age;

    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
//        return "student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}


class PrimarySchoolStudent extends student {
    private String parentName;
    PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;

    }

    @Override
    public String toString() {
        return parentName + " 's kid, " +  super.toString();
    }
}

/*
        Object is the base class or root class of every class in Java, which means
        all classes can use or override object's methods.

 */