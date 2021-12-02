package defaultPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person extends Creature {
    private final String mail;
    private final String address;

    public Person(String mail,
                  String address,
                  String firstname,
                  String lastname,
                  Float size,
                  Float weight,
                  Date birthday,
                  Gender gender
    ) {
        super(firstname,
                lastname,
                size,
                weight,
                birthday,
                gender
        );
        this.mail = mail;
        this.address = address;
    }

    public Person() {
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Tell me your mail?"));
        this.mail = scanner.nextLine();
        System.out.println(this.mail);

        System.out.println(("Tell me your address?"));
        this.address = scanner.nextLine();
        System.out.println(this.address);
    }

    public String getMail() {
        return this.mail;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(this.getBirthday());

        String newLine = System.getProperty("line.separator");

        return this.getFirstname() +
                " " +
                this.getLastname() +
                ", i'm a " +
                this.getClass().getSimpleName() +
                " born in the year of our Lord " +
                strDate +
                " , made of " +
                this.getWeight().toString() +
                " kg of good meat, watching the world from the altitude of " +
                this.getSize().toString() +
                " looking for " +
                this.getGender().lookingPartner() +
                newLine +
                "If yo are one of this,  mail me there : " +
                this.getMail() +
                " or just come to here my door is open " +
                this.getAddress() +
                " ;-)"
                ;
    }
}
