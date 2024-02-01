package classes_and_access_modifiers;

public class PlanetMain {

    public static void main(String[] args) {
        Planet myPlanet = new Planet();
        myPlanet.assignValues();

        Planet bigPlanet = new Planet();
        bigPlanet.assignValues("Jupiter", 16);

        Planet hottestPlanet = new Planet();
        hottestPlanet.assignValues(1, "Mercuty");

        //myPlanet.assignValues("Earth"); Gives error as assignValues(String) is not available

        Planet ourPlanet = new Planet();

        Planet interestingPlanet = new Planet("Saturn", 14);

        Planet shiningPlanet = new Planet(2, "Venus");

        System.out.println(ourPlanet.getName() + ", " + ourPlanet.getMoons());
        System.out.println(interestingPlanet.getName() + ", " + interestingPlanet.getMoons());
        System.out.println(shiningPlanet.getName() + ", " + shiningPlanet.getMoons());

    }
}
