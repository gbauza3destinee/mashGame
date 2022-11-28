import java.util.HashSet;

public class JobTitle {

    public static String jobTitle;

    public int counter;

    private static HashSet<String> jobTitleSet;

    /** Constructor for JobTitle Category
     * Saves and instantiates an instance of a job title provided by a user's entry
     * Stores this job title into the JobTitleSet.
     * Case Sensitivity set to LowerCase for this String.
     */

    public JobTitle(String jobTitle){
        this.jobTitle = jobTitle;
        jobTitle.toLowerCase();
        jobTitleSet = new HashSet<>();
        jobTitleSet.add(jobTitle);
    }

    public void counterMethod(){
        counter = 0;
        try {
            for (String jobTitle : jobTitleSet) {
                counter = +1;
                String.format("You currently have provided %s entries. You will need to enter 4.", jobTitleSet.size());
            }
        } catch(IndexOutOfBoundsException e){
            if (counter > 4){
                System.out.println("Error! You have exceeded the " +
                        "amount of entries for this category, only 4 entries are allowed.");
                throw new IndexOutOfBoundsException();
            }
        }
    }


    public static String getThisJobTitle() {
        return jobTitle;
    }

    public static void setThisJobTitle(String jobTitle) {
        JobTitle.jobTitle = jobTitle;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static HashSet<String> getJobTitleSet() {
        return jobTitleSet;
    }

    public static void setJobTitleSet(HashSet<String> jobTitleSet) {
        JobTitle.jobTitleSet = jobTitleSet;
    }
}
