public class Dimension {
    private  double minLatitude;
    private  double maxLatitude;
    private  double minLongitude;
    private  double maxLongitude;

    public Dimension(double minLatitude, double minLongitude) {
        this.minLatitude = minLatitude;
        this.minLongitude = minLongitude;
    }

    public Dimension(double minLatitude, double maxLatitude, double minLongitude, double maxLongitude) {
        this.minLatitude = minLatitude;
        this.maxLatitude = maxLatitude;
        this.minLongitude = minLongitude;
        this.maxLongitude = maxLongitude;
    }

    public double getMinLatitude() {
        return minLatitude;
    }

    public double getMaxLatitude() {
        return maxLatitude;
    }

    public double getMinLongitude() {
        return minLongitude;
    }

    public double getMaxLongitude() {
        return maxLongitude;
    }
}
