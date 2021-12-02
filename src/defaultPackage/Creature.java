package defaultPackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class Creature implements Species{
    private String firstname;
    private String lastname;
    private Float size;
    private Float weight;
    private Date birthday;
    private Gender gender;

    public Creature(String firstname,
                    String lastname,
                    Float size,
                    Float weight,
                    Date birthday,
                    Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.size = size;
        this.weight = weight;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Creature() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        System.out.println(("Hi buddy tell me who you are?"));

        System.out.println(("Tell me your firstname?"));
        this.firstname = scanner.nextLine();
        System.out.println(this.firstname);

        System.out.println(("Tell me your lastname?"));
        this.lastname = scanner.nextLine();
        System.out.println(this.lastname);

        System.out.println(("Tell me your size small tiny creature?"));
        this.size = scanner.nextFloat();
        System.out.println(this.size);

        System.out.println(("How much meat there is on you?"));
        this.weight = scanner.nextFloat();
        System.out.println(this.weight);

        System.out.println(("When did you come in this tiny world, creature? (format '14-Jun-2000')"));
        String stringDate = scanner.next();
        try {
            this.birthday = formatter.parse(stringDate);
        }
        catch (Exception e){
            this.birthday = new Date();
            System.out.println("i think you wrote it wrong we register the current time then.");
        }
        System.out.println(this.birthday);

        /* TODO Gender */
        Gender[] genders = Gender.values();
        System.out.println((Arrays.toString(genders)));

        this.gender = Gender.FEMALE;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Float getSize() {
        return this.size;
    }

    public Float getWeight() {
        return this.weight;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getSpecies() {
        return this.getClass().getSimpleName();
    }
}
