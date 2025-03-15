public class Note {
}


/*

            Encapsulation
      In Java, encapsulation means hiding things by making them
      private or inaccessible.
      Why hide things ?
      why would we want to hide things in Java ?
        1) To make the interface simpler, we may want to hide unnecessary
      details.
        2) To protect the integrity of data on an object, we may hide
        or restrict access to some of the data and operations.

        3) To decouple the published interface from the internal details
        of the class, we may hide actual names and types of class members.
        * This gives us more flexibility if we have to change the class in the
        future.
                What do we mean by interface here ??
        Java has a type called interface, that's not what we're talking about here.
        When I talk about a class's public or published interface, I'm really talking
        about the class members that are exposed to or can be accessed by the calling code.

        Everything else in the class in internal or private to it.

        An application programming interface or API is the public contract that tells others
        how to use the class.

        ***************** If we don't use encapsulation **************  :
        Problem one :
        Allowing direct access to data on an object can potentially bypass checks and
        additional processing your class has in place to manage the data.

        Problem Two :
        Allowing direct access to fields means calling code would need to change when you
        edit any of the fields

        Problem Three :
        Omitting a constructor that would accept initialization data means the calling code
        is responsible for setting up this data on the new object.

       ** The problems when classes aren't properly encapsulated :
        Allowing direct access to data on an object can bypass checks and operations.
        It encourages an interdependency or coupling between the calling code and
        the class.
        *** Encapsulation solve all three of these problems.

        *** Benefits of Encapsulation :
        That's really one of the huge benefits of encapsulation. changes made do not affect
        any other code. It's like a black box in many ways.
        the only way to create an enhanced player object is to call the constructors we
        have defined. And those constructors have got rules in them for what health can be.
        But the other things is I can't bypass the enhanced player's methods and change
        the health field directly.
        The enhanced player class has full control over its data.
                Staying in Control :
        This is why you want to use encapsulation. we really want to protect access to our
        object's data.
        We protect the members of the class and some methods from external access.
        This prevents calling code from bypassing the rules and constraints we've built
        into the class.

         ***** Encapsulation principles :
         To create an encapsulated class, you want to :
           1) Create constructors for object initialization, which enforces that only objects
           with valid data will get created.
           2)  Use the private access modifier for your fields.
           3) Use setter methods sparingly and only as needed.
           4) Use access modifiers that aren't private, only for the methods that the calling
           code needs to use.










 */