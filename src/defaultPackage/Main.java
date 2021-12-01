package defaultPackage;

import java.util.Arrays;
import java.util.Date;

public class Main {
    private static Object Person;

    public static void main (String[] args) {
        Cat myCat = new Cat("zob",
                "zoub",
                1021F,
                325F,
                new Date(),
                Gender.FEMALE
        );
        System.out.println(("Hello World!!"));
        Gender[] genders = Gender.class.getEnumConstants();
        System.out.println(Arrays.toString(genders));
        System.out.println(myCat);
    }
}
