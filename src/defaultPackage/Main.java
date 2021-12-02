package defaultPackage;

import java.util.Date;

public class Main {

    public static void main (String[] args) {

        Cat myCat = new Cat(
                "cat",
                "zoub",
                "De Gouttière, with a matricule",
                10.21F,
                3.25F,
                new Date(),
                Gender.FEMALE
        );
        Person myPerson = new Person(
                "machin@machine.com",
                "tout la bas",
                "per",
                "zob",
                10.21F,
                3.25F,
                new Date(),
                Gender.MALE
        );

        System.out.println(("Hi there..."));
        System.out.println(myCat);
        System.out.println(myPerson);

        System.out.println(("Register as a cat :"));
        Cat registerCat = new Cat();

        System.out.println(("Register as a person :"));
        Person registerPerson = new Person();

        System.out.println(registerCat);
        System.out.println(registerPerson);
    }
}
