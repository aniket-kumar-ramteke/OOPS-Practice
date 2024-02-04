package inheritance;

public class SimpleInheritanceMain {

    public static void main(String[] args) {
        /*
         * CricketPlayer cp = new CricketPlayer(); cp.setName("Sachin Tendulkar");
         * cp.setAge(50); cp.setCareerRuns(34556); cp.setBattingAvg(50.56f);
         *
         * System.out.println("Name: " + cp.getName());
         * System.out.println("Career Runs: " + cp.getCareerRuns());
         */
        //Remaining code to get and print values

        CricketPlayer cp2 = new CricketPlayer("MS Dhoni", 43, 21344, 47.45f);
        System.out.println("Name: " + cp2.getName());
        System.out.println("Career Runs: " + cp2.getCareerRuns());


    }

}
