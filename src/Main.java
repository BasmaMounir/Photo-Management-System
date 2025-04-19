import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Photo photo = new Photo("photo_paris.jpg", LocalDate.of(2021, 7, 14), "Paris", new Dimension(48.0,2.0));
        photo.setTags(new ArrayList<>(Arrays.asList("vacation", "sightseeing", "Eiffel Tower")));

        Photo photo1 = new Photo("photo_ny.jpg", LocalDate.of(2020, 12, 25), "New York", new Dimension(40.0,-74.0));

        Photo photo2 = new Photo("wedding_photo.jpg", LocalDate.of(2022, 5, 15), "Alx", new Dimension(31.0,29.0));
        photo2.setTags(new ArrayList<>(Arrays.asList("wedding", "celebration", "friends", "love")));

        Photo photo3 = new Photo("pyramids_photo.jpg", LocalDate.of(2023, 3, 10), "Giza", new Dimension(30.0,31.0));
        photo3.setTags(new ArrayList<>(Arrays.asList("history", "Egypt", "adventure")));

        Photo photo4 = new Photo("sphinx_photo.jpg", LocalDate.of(2023, 3, 11), "Giza", new Dimension(29.0,31.0));
        photo4.setTags(new ArrayList<>(Arrays.asList("Egypt", "sightseeing", "adventure")));

        Photo photo5 = new Photo("museum_photo.jpg", LocalDate.of(2023, 3, 12), "Cairo", new Dimension(30.1,31.2));
        photo5.setTags(new ArrayList<>(Arrays.asList("culture", "Egypt")));


        PhotoManager photoManager = new PhotoManager();
        photoManager.uploadPhoto(photo);
        photoManager.uploadPhoto(photo1);
        photoManager.uploadPhoto(photo2);
        photoManager.uploadPhoto(photo3);
        photoManager.uploadPhoto(photo4);
        photoManager.uploadPhoto(photo5);


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose a search option:");
            System.out.println("1. Search by Date");
            System.out.println("2. Search by Location Name");
            System.out.println("3. Search by Dimensions");
            System.out.println("4. Search by Single Tag");
            System.out.println("5. Search by Multiple Tags");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Thank you for using this app ");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the date (YYYY-MM-DD): ");
                    String dateInput = scanner.nextLine();
                    LocalDate date = LocalDate.parse(dateInput);
                    photoManager.searchByDate(date);
                    break;

                case 2:
                    System.out.print("Enter the location name: ");
                    String location = scanner.nextLine();
                    photoManager.searchByLocationName(location);
                    break;

                case 3:
                    System.out.print("Enter Latitude: ");
                    double lat = scanner.nextDouble();
                    System.out.print("Enter Longitude: ");
                    double lon = scanner.nextDouble();
                    scanner.nextLine();
                    photoManager.searchByDimensions(lat,lon);
                    break;

                case 4:
                    System.out.print("Enter the tag: ");
                    String tag = scanner.nextLine();
                    photoManager.searchByTag(tag);
                    break;

                case 5:
                    System.out.print("Enter tags separated by commas (e.g. adventure,love): ");
                    String tagsInput = scanner.nextLine();
                    List<String> tags = Arrays.asList(tagsInput.split(","));
                    photoManager.searchByTags(tags);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}
