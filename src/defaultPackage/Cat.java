package defaultPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cat extends Creature implements Species{
    private final String species;

    public Cat(String firstname,
               String lastname,
               String species,
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
        this.species = species;
    }

    public Cat(){
        super();

        Scanner scanner = new Scanner(System.in);

        System.out.println(("Tell me your species?"));
        this.species = scanner.nextLine();
        System.out.println(this.species);
    }

    public String getSpecies() {
        return this.species;
    }

    @Override
    public String toString() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(this.getBirthday());

        return this.getFirstname().toUpperCase() +
                " " +
                this.getLastname().toUpperCase() +
                ", i'am a " +
                this.getClass().getSimpleName() +
                " of species : " +
                this.getSpecies() +
                ", born in the year of our Lord " +
                strDate +
                " , made of " +
                this.getWeight().toString() +
                " kg of good meat, watching the world from the altitude of " +
                this.getSize().toString() +
                " looking for " +
                this.getGender().lookingPartner()
                ;
    }
}
