package rich;

import static java.lang.String.format;

public class PersonRepository {

    private final PersonDao personDao;

    public PersonRepository(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void changePersonalName(Long id, String firstName, String lastName) {
        final Person person = getPersonById(id);
        person.changePersonalName(firstName, lastName);
        personDao.savePerson(person);
    }

    public void relocate(Long id, PostalAddress postalAddress) {
        final Person person = getPersonById(id);
        person.relocateTo(postalAddress);
        personDao.savePerson(person);

    }

    private Person getPersonById(Long id) {
        final Person person = personDao.personOfId(id);
        if (person == null) {
            throw new IllegalStateException(format("Person with id %s does not exist.", id));
        }
        return person;
    }

}
