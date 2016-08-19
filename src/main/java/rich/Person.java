package rich;

public interface Person {

    void changePersonalName(String firstName, String lastName);

    void relocateTo(PostalAddress postalAddress);

    void changeHomeTelephoneNumber(Telephone homeTelephone);

    void disconnectHomeTelephone();

    void changeMobileTelephoneNumber(Telephone mobileTelephone);


}
