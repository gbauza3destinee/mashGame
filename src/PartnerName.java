import java.util.HashSet;

public class PartnerName {

    public int age;
    public String partnerName;

    private static HashSet <PartnerName> partnerNameSet;


    // TODO:
    // 1:

    public PartnerName(String partnerName){
        partnerName = partnerName.toLowerCase();
        this.partnerName = partnerName;
        partnerNameSet= new HashSet<>();
       // partnerNameSet.add();
    }





}
