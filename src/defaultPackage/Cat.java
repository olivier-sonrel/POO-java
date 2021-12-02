package defaultPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cat extends Creature{

    public Cat(String firstname,
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
    }

    @Override
    public String toString() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(this.getBirthday());

        return this.getFirstname() +
                " " +
                this.getLastname() +
                ", i'am a " +
                this.getSpecies() +
                " born in the year of our Lord " +
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
