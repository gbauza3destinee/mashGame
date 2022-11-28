package Categories;

import java.util.HashSet;

public class DreamCar implements CategoryInterface {

    public static int counter;
    public static String dreamCar;
    private static HashSet<String> dreamCarSet;


    public DreamCar(String dreamCar){
        this.dreamCar= dreamCar;
        dreamCarSet = new HashSet<>();
        dreamCarSet.add(dreamCar);

    }

    public DreamCar(){
        this.dreamCar = getDreamCar();
    }

    public void counterMethod(){
        counter = 0;
        try {
            for (String dreamCar : dreamCarSet) {
                counter = +1;
                String.format("You currently have provided %s entries. You will need to enter 4.", dreamCarSet.size());
            }
        } catch(IndexOutOfBoundsException e){
            if (counter > 4){
                System.out.println("Error! You have exceeded the " +
                        "amount of entries for this category, only 4 entries are allowed.");
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DreamCar.counter = counter;
    }

    public static String getDreamCar() {
        return dreamCar;
    }

    public static void setDreamCar(String dreamCar) {
        DreamCar.dreamCar = dreamCar;
    }

    public static HashSet<String> getDreamCarSet() {
        return dreamCarSet;
    }

    public static void setDreamCarSet(HashSet<String> dreamCarSet) {
        DreamCar.dreamCarSet = dreamCarSet;
    }

    @Override
    public String selectionRandomizer() {
        // TODO- Implement Logic to read all user entries for this category
        // and still return 1 Instance of this Category for the result.
        return null;
    }
}
