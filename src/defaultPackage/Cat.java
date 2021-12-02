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

        String lookingPartner = " every gender are good for me, i'm open ;-)";
        switch (this.getGender()){
            case MALE ->  lookingPartner = "a female.";
            case FEMALE -> lookingPartner = "a male.";
            case HERMAPHRODITE -> lookingPartner = "i will take everything i'm kind of adaptable :-)";
        }

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
                lookingPartner
                ;
    }
}
