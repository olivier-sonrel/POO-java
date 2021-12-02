package defaultPackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person extends Creature {
    private String mail;
    private String address;

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

    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail() {
        return this.mail;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        String strDate = formatter.format(this.getBirthday());

        String newligne = System.getProperty("line.separator");

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
                this.getGender().lookingPartner() +
                newligne +
                "If yo are one of this,  mail me there : " +
                this.getMail() +
                " or just come to here my door is open " +
                this.getAddress() +
                " ;-)"
                ;
    }
}
