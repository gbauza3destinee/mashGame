import java.util.HashSet;

public class NumberOfKids {

    public static int amountOfKids;
    public static HashSet<Integer> amountOfKidsSet;


    public NumberOfKids(int amountOfKids){
        Integer amountOfKidsBigInt = (Integer) amountOfKids;
        this.amountOfKids= amountOfKids;
        amountOfKidsSet = new HashSet<>();
        amountOfKidsSet.add(amountOfKids);

    }



}
