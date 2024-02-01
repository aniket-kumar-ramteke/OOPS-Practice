package classes_and_access_modifiers;

public class LearnArray {

    public static void main(String[] args) {
        int numbers[] = new int[5];
        //Declares an array of type 'int' named as 'numbers' with dimension 5
        numbers[0] = 21;
        numbers[1] = 22;
        numbers[2] = 23;
        numbers[3] = 24;
        numbers[4] = 25;
        //The above fragment initialized the array

		/*int size = numbers.length;
		for(int index = 0; index < size; index++) {
			int number = numbers[index];
			System.out.println(number);
		}*/
        //Using FOR-EACH
        for (int current : numbers) {
            System.out.println(current);
        }

        String[] fruits = {"Apple","Banana","Orange","Kiwi","Mango"};
        //Declares and initializes a String array
        for (String currentFruit : fruits){
            System.out.println(currentFruit.toUpperCase());
        }
    }

}
