import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Photo {
    private String name;
    private LocalDate date;
    private Dimension dimension;
    private String location;
    private List<String> tags;

    public Photo(String name, LocalDate date, String location, Dimension dimension) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.dimension = dimension;
        this.tags = new ArrayList<>();
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        if (tags != null) {
            this.tags.addAll(tags);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    void displayPhotoData() {
        System.out.println("Displaying photo data");
        System.out.println("-------------------------------------------");
        System.out.println("Photo Name: " + this.name);
        System.out.println("Photo date: " + this.date);
        System.out.println("Photo Location: " + this.location);
        System.out.println("Photo Dimensions: " + this.dimension.getMinLatitude() + " , " + this.dimension.getMinLongitude());
        if (tags != null) {
            System.out.println("Tags: ");
            for (String tag : tags) {
                System.out.println("\t" + tag);
            }
            System.out.println("-------------------------------------------");
        }
    }

}
