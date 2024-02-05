package inheritance;

public class Training {
    private String moduleName;
    private int duration;

    public Training() {

    }
    public Training(String moduleName, int duration) {
        this.moduleName = moduleName;
        this.duration = duration;
    }
    public String getModuleName() {
        return moduleName;
    }
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void conduct() {
        System.out.println("Conduct the training");
    }

    public String getDetails() {
        String details = "Module: " + moduleName + ", Duration (Days): " + duration;
        return details;
    }


}