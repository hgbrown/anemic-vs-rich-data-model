package anemic;

import com.google.common.base.MoreObjects;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private String stateOrProvince;
    private String postalCode;
    private String country;
    private String homePhone;
    private String mobilePhone;
    private String workEmailAddress;
    private String personalEmailAddress;

    public Person() {
    }

    public Person(Long id,
                  String firstName,
                  String lastName,
                  String streetAddress1,
                  String streetAddress2,
                  String city,
                  String stateOrProvince,
                  String postalCode,
                  String country,
                  String homePhone,
                  String mobilePhone,
                  String workEmailAddress,
                  String personalEmailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
        this.country = country;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workEmailAddress = workEmailAddress;
        this.personalEmailAddress = personalEmailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkEmailAddress() {
        return workEmailAddress;
    }

    public void setWorkEmailAddress(String workEmailAddress) {
        this.workEmailAddress = workEmailAddress;
    }

    public String getPersonalEmailAddress() {
        return personalEmailAddress;
    }

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getStreetAddress1(), person.getStreetAddress1()) &&
                Objects.equals(getStreetAddress2(), person.getStreetAddress2()) &&
                Objects.equals(getCity(), person.getCity()) &&
                Objects.equals(getStateOrProvince(), person.getStateOrProvince()) &&
                Objects.equals(getPostalCode(), person.getPostalCode()) &&
                Objects.equals(getCountry(), person.getCountry()) &&
                Objects.equals(getHomePhone(), person.getHomePhone()) &&
                Objects.equals(getMobilePhone(), person.getMobilePhone()) &&
                Objects.equals(getWorkEmailAddress(), person.getWorkEmailAddress()) &&
                Objects.equals(getPersonalEmailAddress(), person.getPersonalEmailAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(),
                getLastName(),
                getStreetAddress1(),
                getStreetAddress2(),
                getCity(),
                getStateOrProvince(),
                getPostalCode(),
                getCountry(),
                getHomePhone(),
                getMobilePhone(),
                getWorkEmailAddress(),
                getPersonalEmailAddress());
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("firstName", firstName)
                .add("lastName", lastName)
                .add("streetAddress1", streetAddress1)
                .add("streetAddress2", streetAddress2)
                .add("city", city)
                .add("stateOrProvince", stateOrProvince)
                .add("postalCode", postalCode)
                .add("country", country)
                .add("homePhone", homePhone)
                .add("mobilePhone", mobilePhone)
                .add("workEmailAddress", workEmailAddress)
                .add("personalEmailAddress", personalEmailAddress)
                .toString();
    }
}
