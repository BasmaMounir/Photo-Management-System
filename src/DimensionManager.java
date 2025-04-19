import java.util.HashMap;
import java.util.Map;

// Data Class
public class DimensionManager {

     Map<String, Dimension> dimensionMap = new HashMap<>();

    public DimensionManager() {
        dimensionMap.put("Egypt", new Dimension(22.0, 31.0, 25.0, 35.0));
        dimensionMap.put("United States", new Dimension(24.396308, 49.384358, -125.0, -66.93457));
        dimensionMap.put("United Kingdom", new Dimension(49.8765, 58.6372, -7.5722, 1.6784));
        dimensionMap.put("France", new Dimension(41.303, 51.124, -5.0, 9.6));
        dimensionMap.put("Germany", new Dimension(47.3, 55.0, 5.9, 15.0));
        dimensionMap.put("India", new Dimension(6.8, 35.0, 68.7, 97.4));
        dimensionMap.put("China", new Dimension(18.0, 53.0, 73.5, 135.0));
        dimensionMap.put("Russia", new Dimension(41.0, 81.0, 19.0, 169.0));
        dimensionMap.put("Australia", new Dimension(-43.7, -10.0, 112.0, 154.0));
        dimensionMap.put("Brazil", new Dimension(-33.7, 5.3, -74.0, -34.0));
        dimensionMap.put("Canada", new Dimension(41.7, 83.1, -141.0, -52.0));
        dimensionMap.put("Japan", new Dimension(24.396308, 45.0, 122.9, 153.9));
        dimensionMap.put("South Africa", new Dimension(-34.0, -22.0, 16.5, 32.9));
        dimensionMap.put("Mexico", new Dimension(14.5, 32.7, -118.0, -86.7));
        dimensionMap.put("Argentina", new Dimension(-55.0, -21.7, -73.5, -53.0));
        dimensionMap.put("Italy", new Dimension(36.6, 47.1, 6.7, 18.6));
        dimensionMap.put("Spain", new Dimension(27.6, 43.6, -18.1, 4.5));
        dimensionMap.put("Saudi Arabia", new Dimension(16.0, 32.0, 34.5, 55.0));
        dimensionMap.put("South Korea", new Dimension(33.0, 38.0, 126.0, 130.0));
        dimensionMap.put("Turkey", new Dimension(36.0, 42.1, 26.0, 45.0));
    }
}

