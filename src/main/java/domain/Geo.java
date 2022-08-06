package domain;

public class Geo {
    private String type;
    private String coordinates;
    private Place place;

    public Geo (String type, String coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getCoordinates() {

        return coordinates;
    }

    public void setCoordinates(String coordinates) {

        this.coordinates = coordinates;
    }
}
