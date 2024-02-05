package inheritance;

public class MethodOverridingExample2 {

    public static void main(String[] args) {
        Training trg;
        trg = new OfflineTraining("OOP using Java", 10, "YCP, Mumbai");
        System.out.println(trg.getDetails());

        trg = new OnlineTraining("Web based Java", 10, "http://oracle.zoom.us/244");
        System.out.println(trg.getDetails());

    }

}