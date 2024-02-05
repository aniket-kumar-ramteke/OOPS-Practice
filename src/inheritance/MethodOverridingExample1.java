package inheritance;

public class MethodOverridingExample1 {

    public static void main(String[] args) {
        /*
         * OfflineTraining offTrg = new OfflineTraining(); OnlineTraining onTrg = new
         * OnlineTraining();
         *
         * offTrg.conduct(); onTrg.conduct();
         */

        Training trg;
        trg = new OfflineTraining();

        OfflineTraining ofTrg = (OfflineTraining)trg;
        ofTrg.setVenue("YCP");
        //((OfflineTraining)trg).setVenue("YCP");
        trg.conduct();
        System.out.println(ofTrg.getVenue());
        //trg.setVenue(); This results into error because setVenue() is undefined in Training

        trg = new OnlineTraining();
        trg.conduct();


    }

}
