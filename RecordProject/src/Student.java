public class Student {

    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
 /*

 The POJO => Plain Old Java Object:
    lots of boilerplate code.
    Repetitive and follows certain rules.( constructor with
    parameters for every field in my class, as well as getter
    and setters for each field.) so The Record is the best
    alternative

 The Record =>
        * The record was introduced in JDK 14 and become officially
        part of Java in JDK 16.
        * The purpose is to replace the boilerplate code of the
        POJO but to be more restrictive.
        Java calls them "plain data carriers". The word carrier
        is an important term because it means the record has more
        rules built-in than a POJO would.
        ** The record is a special class that contains data that's
        not meant to be altered.
        It contains only the most fundamental methods, such as
        constructor and accessor or getters.
        Best of all, the developer don't have to write or generate
        any of this code.


            Annotation  ( @ )
       Annotations are a type of metadata.
       Metadata is a way to formally describe additional
       information about out code. like here (@Override)
       Annotations are more structured and have more meaning
       than comments.
       This is because they can be used by the compiler or
       other types of pre-processing functions, to get
       information about the code.
       Metadata doesn't affect how the code runs so this code
       will still run with or without the annotation.

       ** Overridden Method :
       Is a special method in Java that other classes can
       implement if they use a specified method signature.




  */