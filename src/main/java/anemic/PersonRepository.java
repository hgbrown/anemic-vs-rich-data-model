package anemic;

public class PersonRepository {

    private final PersonDao personDao;

    public PersonRepository(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void savePerson(Long id,
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

        Person person = personDao.readPerson(id);

        if (person == null) {
            person = new Person();
            person.setId(id);
        }

        if (firstName != null) {
            person.setFirstName(firstName);
        }

        if (lastName != null) {
            person.setLastName(lastName);
        }

        if (streetAddress1 != null) {
            person.setStreetAddress1(streetAddress1);
        }

        if (streetAddress2 != null) {
            person.setStreetAddress2(streetAddress2);
        }

        if (city != null) {
            person.setCity(city);
        }

        if (stateOrProvince != null) {
            person.setStateOrProvince(stateOrProvince);
        }

        if (postalCode != null) {
            person.setPostalCode(postalCode);
        }

        if (country != null) {
            person.setCountry(country);
        }

        if (homePhone != null) {
            person.setHomePhone(homePhone);
        }

        if (mobilePhone != null) {
            person.setMobilePhone(mobilePhone);
        }

        if (workEmailAddress != null) {
            person.setWorkEmailAddress(workEmailAddress);
        }

        if (personalEmailAddress != null) {
            person.setPersonalEmailAddress(personalEmailAddress);
        }

        personDao.savePerson(person);
    }
}
