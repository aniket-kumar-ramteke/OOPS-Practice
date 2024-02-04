package inheritance;

public class CricketPlayer extends Player {
    private int careerRuns;
    private float battingAvg;

    public CricketPlayer() {
        //super(); This how it is processed by default
        System.out.println("Inside CricketPlayer()");
    }

    public CricketPlayer(String name, int age, int careerRuns, float battingAvg) {
        super(name, age);
        this.careerRuns = careerRuns;
        this.battingAvg = battingAvg;
    }

    public int getCareerRuns() {
        return careerRuns;
    }
    public void setCareerRuns(int careerRuns) {
        this.careerRuns = careerRuns;
    }
    public float getBattingAvg() {
        return battingAvg;
    }
    public void setBattingAvg(float battingAvg) {
        this.battingAvg = battingAvg;
    }


}
