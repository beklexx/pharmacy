package dictionaries.geography;

public class City extends Country{
    private int cityId;
    private String name;
    private Country country;

    public City(int cityId, String name, Country country) {
        this.cityId = cityId;
        this.name = name;
        this.country = country;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
