package defaultPackage;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class Creature{
    private final String firstname;
    private final String lastname;
    private final Float size;
    private final Float weight;
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

        System.out.println("Say me who you are, i gonna say you what you looking for : " + (Arrays.toString(Gender.values())));
        try{
           this.gender = Gender.valueOf(scanner.next().toUpperCase(Locale.ROOT));
        } catch (IllegalCallerException | IllegalArgumentException e){
            System.out.println("i think you wrote it wrong, let say you are none of it");
            this.gender = Gender.SEXLESS;
        }
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
}
