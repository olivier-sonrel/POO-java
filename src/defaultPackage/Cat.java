package defaultPackage;

import java.util.Date;

public class Cat extends Creature{

    public Cat(String firstname,
               String lastname,
               Float size,
               Float weight,
               Date birthday,
               Gender gender) {
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
        return this.getFirstname() +
                ' ' +
                this.getLastname() +
                ", i'am a " +
                this.getSpecies();
    }
}
