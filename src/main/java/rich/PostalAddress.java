package rich;

public final class PostalAddress {

    private final String streetAddress1;
    private final String streetAddress2;
    private final String city;
    private final String stateOrProvince;
    private final String postalCode;

    public PostalAddress(String streetAddress1, String streetAddress2, String city, String stateOrProvince, String postalCode) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.stateOrProvince = stateOrProvince;
        this.postalCode = postalCode;
    }

    public String streetAddress1() {
        return streetAddress1;
    }

    public String streetAddress2() {
        return streetAddress2;
    }

    public String city() {
        return city;
    }

    public String stateOrProvince() {
        return stateOrProvince;
    }

    public String postalCode() {
        return postalCode;
    }

}
