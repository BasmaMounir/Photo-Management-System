import java.time.LocalDate;
import java.util.*;

public class PhotoManager {

    private Map<String, List<Photo>> photosByLocation = new HashMap<>();
    private Map<LocalDate, List<Photo>> photosByDate = new HashMap<>();
    private Map<String, List<Photo>> photosByTag = new HashMap<>();

    public boolean uploadPhoto(Photo photo) {
        if (!photosByLocation.containsKey(photo.getLocation())) {
            photosByLocation.put(photo.getLocation(), new ArrayList<>());
        }
        photosByLocation.get(photo.getLocation()).add(photo);


        if (!photosByDate.containsKey(photo.getDate())) {
            photosByDate.put(photo.getDate(), new ArrayList<>());
        }
        photosByDate.get(photo.getDate()).add(photo);

        for (String tag : photo.getTags()) {
            if (!photosByTag.containsKey(tag)) {
                photosByTag.put(tag, new ArrayList<>());
            }
            photosByTag.get(tag).add(photo);
        }
        return true;
    }


    void searchByDate(LocalDate date) {
        List<Photo> photos = photosByDate.get(date);

        if (photos != null && !photos.isEmpty()) {
            for (Photo photo : photos) {
                photo.displayPhotoData();
            }
        } else {
            System.out.println("There are no photos with this date");
        }
    }

    void searchByLocationName(String locationName) {
        List<Photo> photos = photosByLocation.get(locationName);

        if (photos != null && !photos.isEmpty()) {
            for (Photo photo : photos) {
                photo.displayPhotoData();
            }
        } else {
            System.out.println("There are no photos with this Location");
        }
    }

    public void searchByDimensions(double latitude, double longitude) {
        DimensionManager dimensionManger = new DimensionManager();
        boolean found = false;

        for (Map.Entry<String, Dimension> entry : dimensionManger.dimensionMap.entrySet()) {
            String key = entry.getKey();
            Dimension dimension = entry.getValue();

            if (latitude >= dimension.getMinLatitude() &&
                    latitude <= dimension.getMaxLatitude() &&
                    longitude >= dimension.getMinLongitude() &&
                    longitude <= dimension.getMaxLongitude()) {

                System.out.println("This photo is within the limits of: " + key);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("These dimensions do not exist.");
        }
    }


    public void searchByTag(String tag) {
        List<Photo> photos = photosByTag.get(tag);

        if (photos != null && !photos.isEmpty()) {
            for (Photo photo : photos) {
                photo.displayPhotoData();
            }
        } else {
            System.out.println("There are no photos with this Tag");
        }
    }

    public void searchByTags(List<String> tags) {
        for (String tag : tags) {
            searchByTag(tag);
        }
    }


}

