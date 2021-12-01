package defaultPackage;

import java.util.Date;

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
