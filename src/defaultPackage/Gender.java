package defaultPackage;

public enum Gender {
    SEXLESS , HERMAPHRODITE , MALE , FEMALE;

    public String lookingPartner() {
        String lookingPartner = " every gender are good for me, i'm open ;-)";
        switch (this){
            case MALE ->  lookingPartner = "a female.";
            case FEMALE -> lookingPartner = "a male.";
            case HERMAPHRODITE -> lookingPartner = "i will take everything i'm kind of adaptable :-)";
        }
        return lookingPartner;
    }
}
