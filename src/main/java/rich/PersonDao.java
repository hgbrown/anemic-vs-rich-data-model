package rich;

public interface PersonDao {

    /**
     * Get the person with the specified unique identifier if they exist.
     *
     * @param id            the unique identifier of the person to be read. Should not be {@code null}.
     * @return              {@code null} if no person with the specified unique id exists, otherwise the person with the
     *                      specified unique identifier.
     * @throws NullPointerException
     *                      if the {@code id} is {@code null}.
     */
    Person personOfId(Long id);

    /**
     * Persist the specified person to the underlying data store.
     *
     * @param person            the person to be persisted. Should not be {@code null}.
     * @throws NullPointerException
     *                          if the {@code person} is {@code null}.
     */
    void savePerson(Person person);
}
