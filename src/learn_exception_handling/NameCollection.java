package learn_exception_handling;

public class NameCollection {
    private static String[] names = {"Ankush", "Sonali", "Swapnil", "Sachin", "Aniket"};

    public static int getPosition(String name) throws NameNotFoundException{
        int position = -1;
        for(int index = 0; index < names.length; index++) {
            if(names[index].equals(name)) {
                position = index;
                break;
            }
        }
        if(position == -1) {//Throw the exception
            String errorInfo = "This name does not exist.";
            NameNotFoundException nx =
                    new NameNotFoundException(errorInfo, name);
            throw nx;
        }
        return position;
    }
}
