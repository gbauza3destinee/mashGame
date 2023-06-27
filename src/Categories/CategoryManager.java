package Categories;

import UserInteraction.MashPrompt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CategoryManager {


    public CarType carType;
    public HomeType homeType;
    public JobTitle jobTitle;
    public LocationEnvironment locationEnvironment;
    public NumberOfKids numberOfKids;
    public PartnerName partnerName;
    public SalaryRange salaryRange;
    private MashPrompt mashPrompt;
    private static Scanner userKeyboardDevice;

    public CategoryManager(MashPrompt mashPrompt){
        this.mashPrompt =  mashPrompt;
        userKeyboardDevice = mashPrompt.dy();
    }

    /**
     * Formats all Enum Types of House as Array to Iterate with provided num
     * @return
     */
    public HomeType homeRandomizer(int userSelectedNum) {
        HomeType[] houseTypeArr = new HomeType[6];
        houseTypeArr[0]= HomeType.BOAT_HOUSE;
        houseTypeArr[1]= HomeType.APARTMENT;
        houseTypeArr[2]= HomeType.COTTAGE_HOUSE;
        houseTypeArr[3]= HomeType.BEACH_SHACK;
        houseTypeArr[4]= HomeType.TWO_FLOOR_LOFT;
        houseTypeArr[5]= HomeType.MOUNTAIN_CAVE_HOME;

        int usersSelection = Integer.parseInt(userKeyboardDevice.nextLine());// Get user choice and convert to int value

        for(HomeType thisHome: houseTypeArr)


            return null;
    }

    /**
     * Formats all Enum Types of JobTitles as Array to Iterate, and count down with user specified num
     * @return
     */
    public JobTitle jobTitleRandomizer(int userSelectedNum) {
        JobTitle[] jobTitles = new JobTitle[8];
        jobTitles[0]= jobTitle.ARCHITECT;
        jobTitles[1]= jobTitle.THERAPIST;
        jobTitles[2]= jobTitle.COFFEE_SHOP_OWNER;
        jobTitles[3]= jobTitle.ELECTRONIC_REPAIRER;
        jobTitles[4]= jobTitle.RACE_DRIVER;
        jobTitles[5]= jobTitle.STAY_AT_HOME;
        jobTitles[6]= jobTitle.LOCAL_FOOD_CRITIC;
        jobTitles[7] = jobTitle.MICHELIN_STAR_CHEF;


        int usersSelection = Integer.parseInt(userKeyboardDevice.nextLine());// Get user choice and convert to int value

        for(JobTitle thisJob: jobTitles)

        return null;
    }

    /**
     * Formats all Enum Types of LocationEnvironments as Array to Iterate with user provided num
     * @return
     */

    public LocationEnvironment locationEnvironmentRandomizer(int userSelectedNum) {
        LocationEnvironment[] locationEnvironmentsArr = new LocationEnvironment[6];
        locationEnvironmentsArr[0]= locationEnvironment.BEACHSIDE;
        locationEnvironmentsArr[1]= locationEnvironment.ON_AN_ANT_HILL;
        locationEnvironmentsArr[2]= locationEnvironment.WINDOWS_OVERLOOK_A_CANAL;
        locationEnvironmentsArr[3]= locationEnvironment.FOREST_SURROUNDED;
        locationEnvironmentsArr[4]= locationEnvironment.FOREST_SURROUNDED;
        locationEnvironmentsArr[5]= locationEnvironment.SURBURBAN_GRIDHOME;


        for(LocationEnvironment thisLocEnvironment: locationEnvironmentsArr)

            return null;
    }



    /**
     * Formats all Enum Types of NumberOfKids as Array to Iterate, and count down with user specified num
     * @return
     */
    public NumberOfKids numOfKidsRandomizer(int userSelectedNum){
        NumberOfKids[] numberOfKidsArr = new NumberOfKids[56];
        numberOfKidsArr[0]= numberOfKids.MORE_THAN_2;
        numberOfKidsArr[1] = numberOfKids.ZERO;
        numberOfKidsArr[2]= numberOfKids.SLIGHTLY_LESS_THAN_100;
        numberOfKidsArr[3]= numberOfKids.MORE_THAN_2;
        numberOfKidsArr[4]= numberOfKids.EXACTLY1;
        numberOfKidsArr[5]= numberOfKids.FUR_BABIES;


        for(NumberOfKids numberOfKidsAnswer: numberOfKidsArr)

            return null;
    }



    /**
     * Formats all Enum Types of CarTypes as Array to Iterate, and count down with user specified num
     * @return
     */
    public CarType carTypeRandomizer(int userSelectedNum) {
        CarType[] carTypes = new CarType[5];
        carTypes[0] = CarType.CONVERTIBLE;
        carTypes[1]=CarType.HEELEYS;
        carTypes[2]=CarType.ITALIAN_MOPED;
        carTypes[3]=CarType.JEEP;
        carTypes[4]=CarType.TRUCK;


        for(CarType thisCar: carTypes)

            return null;
    }

    /**
     * Formats all Enum Types of PartnerNames as Array to Iterate, and count down with user specified num
     * @return
     */
    public PartnerName partnerNameRandomizer (int userSelectedNum) {
        PartnerName[] partnerNames = new PartnerName[6];
        partnerNames[0] = partnerName.JASPER;
        partnerNames[1]=partnerName.RAE;
        partnerNames[2]=partnerName.ONYX;
        partnerNames[3]=partnerName.BIGPAPA;
        partnerNames[4]=partnerName.JASLYN;
        partnerNames[5]=partnerName.SAGE;


        for(PartnerName thisName: partnerNames)

            return null;
    }

    /**
     * Formats all Enum Types of Salary Ranges as Array to Iterate, and count down with user specified num
     * @return
     */
    public SalaryRange salaryRangeRandomizer (int userSelectedNum) {
        SalaryRange[] salaryRanges = new SalaryRange[5];
        salaryRanges[0] = SalaryRange.ONE_HUNDRED_FIFTY_DOLLARS;
        salaryRanges[1]=  SalaryRange.FOUR_BILLION_DOLLARS;
        salaryRanges[2]=  SalaryRange.ONE_HUNDRED_THOUSAND_DOLLARS;
        salaryRanges[3]=  SalaryRange.ONE_LIFETIME_SUPPLY_OF_WHITECASTLEBURGERS;
        salaryRanges[4]=  SalaryRange.FIFTY_THOUSAND_DOLLARS;


        for(SalaryRange thisSalary: salaryRanges){

        }

            return null;
    }




}
