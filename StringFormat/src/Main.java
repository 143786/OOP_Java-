import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n"  +
                "\t\t\u2022 Sub Point\n";

        System.out.println(bulletIt);

        String textBlock = """
              Print a Bulleted List:
                        \u2022 First Point
                            \u2022 Sub Point """ ;

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your ae is %d\n", age);

        int yearOfBirth = 2023 -  age;
        System.out.printf("Age = %d, Birth year = %d%n" , age, yearOfBirth);

        System.out.printf("Your age is %.2f\n",(float) age);

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("`Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age );
        System.out.println(formattedString);

        formattedString = "Your age is %d" .formatted(age);
        System.out.println(formattedString);

}
}

   /*
   Text block

        %d   :  This is a special indicator called a format specifier.
        This is a placeholder for other data, which should replace this
        specifier in the text.
        in this example, I am going to replace %d with age, and that's
        why I pass age as the second argument to this method.

        At their most complex, format specifiers take the form shown here.
        %[argument_index$][flags][width][.precision]conversion

        They start with a percent sign, and end with a conversion symbol, and
        have lots of options in between.

        I've looked at one conversion type, d , which is the symbol used for a
        decimal integer value.


    */