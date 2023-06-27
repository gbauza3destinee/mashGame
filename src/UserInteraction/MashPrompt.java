package UserInteraction;
import Categories.Emojis;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class MashPrompt {

    private String firstName;
    private String userPronouns;
    private static Scanner userKeyboardDevice = new Scanner(System.in);

    /**
     * Owns the UI for the MASH app. It is the CONSOLE
     * It Provides command-line interface
     * to the user, allowing them to submit their Category Entries
     * and passing on the results to the appropriate Classes to store and randomize.
     */

    /********************************************************************************************
     * Constants representing menu options
     ********************************************************************************************/


    public static final String BEGIN_PROMPT = "Hi! Welcome to MASH, the fortune telling game." +
            "What is your name?";
    public static final String SECOND_PROMPT = String.format("Thank you %s" + userKeyboardDevice.nextLine());
    public static final String THIRD_PROMPT = "What are your pronouns? Answers include : 'They Them', 'She Her', 'He Him', or 'Fae Faun'";

    public static final String FOURTH_PROMPT = "Let's play! For every menu item, select the number corresponding to the" +
            " selection to choose a number. \nBased on the number you pick, your entry will be a surprise until the end of the program!";

    private static final String CONTINUE_PROMPT = "Would you like to select another entry? If so enter a number (y/n)";

    private static final String EXIT_OPTION = "Exit";
    public static final String SHOW_FIXTURES_FLAG = "--show-fixtures";
    private static final Collection<String> VALID_YES_NO_ANSWERS =
            Collections.unmodifiableList(Arrays.asList("y", "n", "Y", "N"));

    /**
     * MASH CATEGORY PROMPTS
     * 1. CHOOSE HOUSE MANSION
     * 2.
     * and passing on the results to the appropriate Classes to store and randomize.
     */

    /********************************************************************************************
     * Constants representing menu options
     ********************************************************************************************/

    private static final String CHOOSE_HOUSE =
            "Choose your house:";
    private static final String CHOOSE_NUMOFKIDS = "Choose your amount of kids: ";

    private static final String CHOOSE_JOBTITLE = "Choose a job title: ";

    private static final String CHOOSE_SALARY_RANGE = "Please enter new entry for JobTitle";
    private static final String CHOOSE_LOCATION_ENVIRONMENT =
            "Please enter new entry for Dream City";
    private static final String CHOOSE_CARTYPE =
            "Please enter new entry for Dream Car";

    private static final String CHOOSE_PARTNERNAME=
            "Please enter new entry for a Name";

    private static final String UNKNOWN_ENTRY_MESSAGE =
            "Unable to read your entry, please try again.";

    private static final String INLINE_PROMPT = "> ";


    /********************************************************************************************
     * Array of menu options display to users as needed
     ********************************************************************************************/
    private static final String[] mainMenuOptions = {CHOOSE_HOUSE
            , CHOOSE_NUMOFKIDS
            , CHOOSE_JOBTITLE
            , CHOOSE_SALARY_RANGE
            , CHOOSE_LOCATION_ENVIRONMENT
            , CHOOSE_CARTYPE
            , CHOOSE_PARTNERNAME
            , EXIT_OPTION
    };


    public MashPrompt() throws FileNotFoundException {
        // Note: use of LinkedList rather than ArrayList due to efficiency when adding/removing


    }


    /********************************************************************************************
     * Display main menu, get response and return response
     ********************************************************************************************/
    public String displayMenuAndGetResponse() {

        int response = -1;  // initialize response to invalid value to be sure we store what user enters

        System.out.println("\n Choose your entry!)\n");

        // CANNOT use an iterator to replace a for loop that uses a simple array.
        for (int i = 0; i < mainMenuOptions.length; i++) {              // Loop through menu option array
            System.out.println(i + 1 + ". " + mainMenuOptions[i]);  //     display a menu option
        }
        System.out.print("\nYour choice: ");                               // Ask user for choice
        try {
            response = Integer.parseInt(userKeyboardDevice.nextLine());// Get user choice and convert to int value
            return mainMenuOptions[response - 1];                      // Return menu option from option array
        } catch (NumberFormatException exceptionObject) {
            throw new IllegalArgumentException("Invalid menu option " + response + " entered: ");
        } catch (ArrayIndexOutOfBoundsException exceptionObject) {
            throw new IllegalArgumentException("Invalid menu option " + response + " entered");
        }
    }  // End of displayMenuAndGetResponse()



    /********************************************************************************************
     * Method that begins execution of flow for program menu options
     ********************************************************************************************/


    public void run() throws FileNotFoundException {

        startOfApplicationProcessing();           // Display greeting
        String whatTheyChose = new String("");    // Hold response from user prompt
        boolean shouldLoop = true;                // Main processing loop control variable
        /********************************************************************************************
         * main processing loop
         ********************************************************************************************/
        while (shouldLoop) {
            try {
                whatTheyChose = displayMenuAndGetResponse();          // Display main menu and get response
                System.out.println("\nYou chose: " + whatTheyChose);  // Display menu option chosen

                switch (whatTheyChose) {                              // Process based on menu option chosen
                    case CHOOSE_HOUSE: {
                        System.out.println("Choose a number from 0 to 5");
                        break;
                    }
                    case CHOOSE_NUMOFKIDS: {
                        System.out.println("Choose a number from 0 to 5");
                        break;
                    }
                    case CHOOSE_JOBTITLE: {
                        System.out.println("Choose a number from 0 to 6");
                        break;
                    }
                    case CHOOSE_SALARY_RANGE: {
                        System.out.println("Choose a number from 0 to 4");
                        break;
                    }
                    case CHOOSE_LOCATION_ENVIRONMENT: {
                        System.out.println("Choose a number from 0 to 6");
                        break;
                    }
                    case CHOOSE_CARTYPE: {
                        System.out.println("Choose a number from 0 to 6");
                        break;
                    }
                    case CHOOSE_PARTNERNAME:{
                        System.out.println("Choose a number from 0 to 5");
                        break;
                    }
                    case EXIT_OPTION: {
                        shouldLoop = false;
                        break;
                    }
                    default: {    // if somehow an unexpected option was returned - throw an exception
                        throw new IllegalArgumentException("Invalid menu option " + whatTheyChose + " entered: ");
                    }
                }
            } catch (IllegalArgumentException exceptionObject) {
                System.out.println("\nUh-Oh, Looks like you entered an invalid response, please try again");
            }
        }
        endOfApplicationProcessing();     // Perform any clean up at end of the application
    }  // End of main processing method - run()


    /********************************************************************************************
     * Starting of application setup processing - display welcome screen
     ********************************************************************************************/
    public void startOfApplicationProcessing() throws FileNotFoundException {

        // This method redirects any error messages to a file rather than a screen to avoid confusion!

        // Assign error messages to be written a file instead of the screen
        // 1. Instantiate a PrintStream object to assign file to the PrintStream object
        PrintStream fileProcessingErrorLogFile = new PrintStream("fileProcessingError.log");
        // 2. Tell Java to use the PrintStream object for error messages
        //       use System.setErr() method
        //    Also you may assign System.out output to a file using setOut() method
        System.setErr(fileProcessingErrorLogFile);
        // Tip if you ever wanted to redirect where system.out output goes, we can redirect this
        // into a file as well using the System.setOut(); Using a different Print Stream Obj of course.


        System.out.println(Emojis.SUNRISE.repeat(40));
        System.out.printf("%1s %s \n", Emojis.HOUSE_WITH_GARDEN, "Welcome to the MASH, choose-your-lifestyle, app!");
        System.out.println(Emojis.RAILWAY_CAR.repeat(40));
    }


    /********************************************************************************************
     * End of application takedown processing - display goodbye message
     ********************************************************************************************/
    public void endOfApplicationProcessing () {
        System.out.println("-".repeat(60) + "\nThank you for using our app!\n" + "-".repeat(60));
    }



//    /* * Generates the user-facing representation of the given MASH selected input. 6.26
//     *
//     */
//
//    private String renderMashTable() {
//        List<String> columnNames = Arrays.asList(
//                "Number Of Kids: ",
//                "Salary Range: ",
//                "Job Title: ",
//                "Dream City: ",
//                "Dream Car: ");
//
//
//        for (int i = 0; i < columnNames.size(); i++) {
//            System.out.println(columnNames.get(0));
//            return columnNames.get(0);
//        }
//        return columnNames.get(0);
//    }



    public final Scanner getUserKeyboardDevice(){
        return userKeyboardDevice;
    }
}

