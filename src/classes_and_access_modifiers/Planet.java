package classes_and_access_modifiers;

public class Planet {
    private String name;
    private int moons;

    public Planet(){
        name = "Earth";
        moons = 1;
    }
    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

    public Planet(int moons,String name) {
        this.name = name;
        this.moons = moons;
    }

    public String getName() {
        return name;
    }

    public void assignValues() {
        name = "Earth";
        moons = 1;
    }
    public void assignValues(String nm, int mn) {
        name = nm;
        moons = mn;
    }
    public void assignValues(int mn, String nm) {
        name = nm;
        moons = mn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }
}



