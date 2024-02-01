package classes_and_access_modifiers;

public class ArrayAsArgument {

    private static void printFlowerNames(String[] flowers){
        for (String flower: flowers) {
            System.out.println(flower.toUpperCase());
        }
    }

    private static double[] getSquareRoots(int[] numbers){
        double[] roots = new double[numbers.length];
        for (int counter = 0; counter < numbers.length; counter++){
            roots[counter] = Math.sqrt((double) numbers[counter]);//Finds a Square Root and returns it
        }
        return roots;
    }

    public static void main(String[] args) {
        String[] flowers = {"Lotus","Lily","Mogra","Petunia","Rose","Marigold"};
        ArrayAsArgument.printFlowerNames(flowers);

        int[] numbersArray = {121,484,625,729,81};
        double[] squareRoots = ArrayAsArgument.getSquareRoots(numbersArray);
        for (double each: squareRoots) {
            System.out.println(each);
        }
    }
}
