import java.util.HashSet;

public class NumberOfKids {

    public static int amountOfKids;
    public static int counter;
    public static HashSet<Integer> amountOfKidsSet;


    public NumberOfKids(int amountOfKids){
        Integer amountOfKidsBigInt = (Integer) amountOfKids;
        this.amountOfKids= amountOfKidsBigInt;
        amountOfKidsSet = new HashSet<>();
        amountOfKidsSet.add(amountOfKids);

    }


    public void counterMethod(){
        counter = 0;
        try {
            for (Integer amountOfKidsBigInt : amountOfKidsSet) {
                counter = +1;
                String.format("You currently have provided %s entries. You will need to enter 4.", amountOfKidsSet.size());
            }
        } catch(IndexOutOfBoundsException e){
            if (counter > 4){
                System.out.println("Error! You have exceeded the " +
                        "amount of entries for this category, only 4 entries are allowed.");
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static int getAmountOfKids() {
        return amountOfKids;
    }

    public static void setAmountOfKids(int amountOfKids) {
        NumberOfKids.amountOfKids = amountOfKids;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        NumberOfKids.counter = counter;
    }

    public static HashSet<Integer> getAmountOfKidsSet() {
        return amountOfKidsSet;
    }

    public static void setAmountOfKidsSet(HashSet<Integer> amountOfKidsSet) {
        NumberOfKids.amountOfKidsSet = amountOfKidsSet;
    }
}
