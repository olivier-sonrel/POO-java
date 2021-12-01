package defaultPackage;

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
        return this.getFirstname() +
                ' ' +
                this.getLastname() +
                ", i'am a " +
                this.getSpecies();
    }
}
