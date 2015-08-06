package in.notwork.calculator;

/**
 * @author rishabh.
 */
public class DistanceCalculator {
    private static DistanceCalculator ourInstance = new DistanceCalculator();

    public static DistanceCalculator getInstance() {
        return ourInstance;
    }

    private DistanceCalculator() {
    }

    public double distanceInKms(double fromLatitude, double fromLongitude,
                                double toLatitude, double toLongitude) {
        return Calculator.getInstance()
                .distance(fromLatitude, fromLongitude, toLatitude, toLongitude, Unit.KMS);
    }

    public double distanceInKms(GeoPoint fromGeoPoint, GeoPoint toGeoPoint) {
        return Calculator.getInstance()
                .distance(fromGeoPoint, toGeoPoint, Unit.KMS);
    }

    public double distanceInMeters(double fromLatitude, double fromLongitude,
                                   double toLatitude, double toLongitude) {
        return Calculator.getInstance()
                .distance(fromLatitude, fromLongitude, toLatitude, toLongitude, Unit.METERS);
    }

    public double distanceInMeters(GeoPoint fromGeoPoint, GeoPoint toGeoPoint) {
        return Calculator.getInstance()
                .distance(fromGeoPoint, toGeoPoint, Unit.METERS);
    }

    public double distanceInMiles(double fromLatitude, double fromLongitude,
                                  double toLatitude, double toLongitude) {
        return Calculator.getInstance()
                .distance(fromLatitude, fromLongitude, toLatitude, toLongitude, Unit.MILES);
    }

    public double distanceInMiles(GeoPoint fromGeoPoint, GeoPoint toGeoPoint) {
        return Calculator.getInstance()
                .distance(fromGeoPoint, toGeoPoint, Unit.MILES);
    }

}
