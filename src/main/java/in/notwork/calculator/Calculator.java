package in.notwork.calculator;

/**
 * @author rishabh.
 * Reused code - copyright Moveable Type Scripts - retrieved May 4,2010.
 * http://www.movable-type.co.uk/scripts/latlong.html
 * Under Creative Commons License http://creativecommons.org/licenses/by/3.0/
 * Converted to Java from JavaScript.
 */
class Calculator {

    private static long radiusKms = 6371; // for calculation in kilometers
    private static long radiusMts = 6371000; // for calculation in meters
    private static long radiusMiles = 3959; // for calculation in miles

    private static Calculator ourInstance = new Calculator();

    public static Calculator getInstance() {
        return ourInstance;
    }

    private Calculator() {
    }

    public double distance(double fromLatitude, double fromLongitude,
                                    double toLatitude, double toLongitude, Unit unit) {
        return distance(
                new GeoPoint(fromLatitude, fromLongitude),
                new GeoPoint(toLatitude, toLongitude), unit);
    }

    public double distance(GeoPoint fromGeoPoint, GeoPoint toGeoPoint, Unit unit) {

        double latitudeDistance = toRadians(toGeoPoint.getLatitude() - fromGeoPoint.getLatitude());
        double longitudeDistance = toRadians(toGeoPoint.getLongitude() - fromGeoPoint.getLongitude());
        double a = calculate(latitudeDistance, longitudeDistance, fromGeoPoint, toGeoPoint);

        return getRadius(unit) * (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)));
    }

    private long getRadius(Unit unit) {
        switch (unit) {
            case MILES: return radiusMiles;
            case METERS: return radiusMts;
            default: return radiusKms;
        }
    }

    private double calculate(double latitudeDistance, double longitudeDistance,
                             GeoPoint fromGeoPoint, GeoPoint toGeoPoint) {

        return Math.sin(latitudeDistance / 2)
                * Math.sin(latitudeDistance / 2)
                + Math.cos(toRadians(fromGeoPoint.getLatitude()))
                * Math.cos(toRadians(toGeoPoint.getLatitude()))
                * Math.sin(longitudeDistance / 2)
                * Math.sin(longitudeDistance / 2);
    }

    private double toRadians(double inDegrees) {
        return Math.toRadians(inDegrees);
    }

}
