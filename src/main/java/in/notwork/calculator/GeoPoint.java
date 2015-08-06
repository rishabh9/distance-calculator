package in.notwork.calculator;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author rishabh.
 */
public class GeoPoint implements Serializable {

    private double latitude;
    private double longitude;

    public GeoPoint() {
        super();
    }

    public GeoPoint(double latitude, double longitude) {
        this();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoPoint)) return false;
        GeoPoint geoPoint = (GeoPoint) o;
        return Objects.equals(latitude, geoPoint.latitude) &&
                Objects.equals(longitude, geoPoint.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }

    @Override
    public String toString() {
        return "GeoPoint{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
