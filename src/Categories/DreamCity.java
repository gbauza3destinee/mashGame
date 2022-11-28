package Categories;

import java.util.HashSet;

public class DreamCity {

    public static int counter;
    public String dreamCity;
    private static HashSet <String> dreamCitySet;

    public DreamCity(String dreamCity){
        this.dreamCity = dreamCity;
        dreamCitySet = new HashSet<>();
        dreamCitySet.add(dreamCity);
    }

    public DreamCity(){
        this.dreamCity = getDreamCity();
    }

    public void counterMethod(){
        counter = 0;
        try {
            for (String dreamCity : dreamCitySet) {
                counter = +1;
                String.format("You currently have provided %s " +
                        "entries. You will need to enter 4.", dreamCitySet.size());
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
        DreamCity.counter = counter;
    }

    public String getDreamCity() {
        return dreamCity;
    }

    public void setDreamCity(String dreamCity) {
        this.dreamCity = dreamCity;
    }

    public static HashSet<String> getDreamCitySet() {
        return dreamCitySet;
    }

    public static void setDreamCitySet(HashSet<String> dreamCitySet) {
        DreamCity.dreamCitySet = dreamCitySet;
    }
}
