import java.util.HashSet;

public class PartnerName {

    public String partnerName;

    public int counter;

    private static HashSet <String> partnerNameSet;

// TODO:
    // 1: Save each instance of a User Provided Partner Name
    // 2: Create a Counter to Limit the amount of entries provided.

    public PartnerName(String partnerName){
        partnerName = partnerName.toLowerCase();
        this.partnerName = partnerName;
        partnerNameSet= new HashSet<>();
        partnerNameSet.add(partnerName);
        System.out.println("%s has been added to your dream list!");

    }

    public void counterMethod(){
        counter = 0;
       try {
           for (String partnerName : partnerNameSet) {
               counter = +1;
              String.format("You currently have provided %s entries. You will need to enter 4.", partnerNameSet.size());
           }
       } catch(IndexOutOfBoundsException e){
                if (counter > 4){
                    System.out.println("Error! You have exceeded the " +
                            "amount of entries for this category, only 4 entries are allowed.");
                   throw new IndexOutOfBoundsException();
               }
           }
       }


       // Getters and Setters for other classes to retrieve information.

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static HashSet<String> getPartnerNameSet() {
        return partnerNameSet;
    }

    public static void setPartnerNameSet(HashSet<String> partnerNameSet) {
        PartnerName.partnerNameSet = partnerNameSet;
    }



}






