package newsapi.objects;

public enum Country {
    AUSTRALIA("au"),
    GERMANY("de"),
    UNITED_KINGDOM("gb"),
    INDIA("in"),
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