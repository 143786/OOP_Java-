public class Note {

    /*

     Inheritance : look kind of interesting, but when would you really use it ?
                It turns out, in Java, you've been using Inheritance all along.
                This is because every class you create in Java actually extends a special
                Java class. That class is named Object, and it's in the java.lang package.
                Ok, that's confusing, a class called Object ?
                Let's see what Java has to say about this class :

                We'll use the link to Java's Application Programming Interface (API)
                Class Object is the root of the class hierarchy.
                Every class has Object as superclass. All objects, including arrays,
                implement the methods of this class. Whether you knew it or not,
                your classes were extending the object class.
                They all inherit from object.

                And what that means is that all of your classes have functionality
                built-in that you can use or override the minute you create them.
                Let's explore the methods on : java.lang.object



/* every class inherits from object, and this actually includes the main class.
    How can we tell ?
    We can use the code generation tools, and you can see that by opening up your
    generate command. if you go to override methods, you can see when i've that
    brings up, this select methods to override or to implement popup. As you can
    see, these are all methods, The M stands for method. These are all methods that
    are inherited from java.lang.object, which is a class. All classes you create
    automatically extend Object. That's equivalent, essentially, to typing extends java
    .lang.object , so I'll do that in my main class:

    We could also just omit the package name, java.lang and just say my class extends
    object.
    For now, I'll just say that Java has a way of implicitly doing things that make our
    jobs easier.
    One of these is to include all objects from its core libaries automatically,
    So we can refer to them like I am doing here.
    As simply object, without the package name.
    The other is to implicitly have all classes extend this object class, that do not
    explicitly extend from another class.
    ** every class inherits from Object
    ** The String class has over 60 methods !
    ** The String class overrides several methods on Object two of which are equals()
    and toString().
    All objects, including arrays,

    ** Only one class in a Java source file can be public.
 */


}
