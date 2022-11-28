import Categories.*;

public class App {

    private static NumberOfKids thisNumOfKidsInstance;
    private static SalaryRange thisSalaryRangeInstance;
    private static JobTitle thisJobTitleInstance;
    private static DreamCity thisDreamCityInstance;
    private static DreamCar thisDreamCarInstance;

    private App(){
    }


    public static NumberOfKids getNumberOfKids() {
        return new NumberOfKids();
    }

    public static SalaryRange getSalaryRange() {
        return new SalaryRange();
    }

    public static JobTitle getJobTitle() {
        return new JobTitle();
    }

    public static DreamCity getDreamCity() {
        return new DreamCity();
    }

    public static DreamCar getDreamCar() {
        return new DreamCar();
    }
}
