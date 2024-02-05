package inheritance;

public class OfflineTraining extends Training {
    private String venue;

    public OfflineTraining() {

    }

    public OfflineTraining(String moduleName, int duration, String venue) {
        super(moduleName, duration);
        this.venue = venue;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void conduct() {
        System.out.println("Visit the venue and conduct the training");
    }
    public String getDetails() {
        String finalDetails = super.getDetails() + ", Venue: " + venue;
        return finalDetails;
    }

}
