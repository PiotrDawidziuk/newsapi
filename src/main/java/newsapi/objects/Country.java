package newsapi.objects;

public enum Country {

    GERMANY("de"),
    UNITED_KINGDOM("gb"),
    ITALY("it"),
    UNITED_STATES("us"),
    POLAND("pl");

    private final String countryCode;

    Country(final String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}