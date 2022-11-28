package UserInteraction;

import Categories.*;

import java.util.*;

public class Shell {

    /**
     * Owns the UI for the MASH app. It is the CONSOLE
     * It Provides command-line interface
     * to the user, allowing them to submit their Category Entries
     * and passing on the results to the appropriate Classes to store and randomize.
     */

    public static final String SHOW_FIXTURES_FLAG = "--show-fixtures";
    private static final String CONTINUE_PROMPT = "Would you like to enter another entry? (y/n)";
    private static final Collection<String> VALID_YES_NO_ANSWERS =
            Collections.unmodifiableList(Arrays.asList("y", "n", "Y", "N"));



    private static App thisApp;
    private static final String PARTNER_NAME_PROMPT =
            "Please enter Partner Name Entry 1";
    private static final String NUMOFKIDS_NAME_PROMPT =
            "Please enter Amount of Kids Entry 1";
    private static final String SALARYRANGE_PROMPT =
            "Please enter Salary Range Entry 1";
    private static final String JOBTITLE_PROMPT =
            "Please enter JobTitle Entry 1";
    private static final String DREAMCITY_PROMPT =
            "Please enter Dream City Entry 1";
    private static final String DREAMCAR_PROMPT =
            "Please enter Dream Car Entry 1";

    private static final String UNKNOWN_ENTRY_MESSAGE =
            "Unable to find any order data for orderId: %s. Please check your order id and try again.";

    private static final String INLINE_PROMPT = "> ";

    /**
     * Command Line Interface entry point. Arguments are ignored.
     *
     * @param args command line args (ignored).
     */
//    public static void main(String[] args) {
//
//        //TODO-
//        Shell shell = new Shell();
//        shell.processCommandLineArgs(args);
//
//        try {
//            do {
//                System.out.println(shell.handleUserRequest());
//            } while (shell.userHasAnotherRequest());
//        } catch (Exception e) {
//            System.out.println("Error encountered. Exiting.");
//        }
//
//        System.out.println("Thank you for using the Promise History CLI. Have a great day!\n\n");
//    }
//
//    /**
//     * Handles a user request to fetch promise history for order IDs, and returns the text to display
//     * to user.
//     *
//     * @return the user-facing output from the last request.
//     */
//    @VisibleForTesting
//    String handleUserRequest() {
//        String response;
//
//        do {
//            response = inputHandler.getString(PARTNER_NAME_PROMPT, INLINE_PROMPT).trim();
//        } while ("".equals(response));
//
//        if (.getOrder() == null) {
//            return String.format(UNKNOWN_ORDER_MESSAGE, response);
//        }
//        return renderOrderTable(promiseHistory.getOrder()) + renderPromiseHistoryTable(promiseHistory);
//    }

    /**
     * Generates the user-facing representation of the given promise history.
     *
     * @param promiseHistory The PromiseHistory to render to user-facing String
     * @return The String representation of the promise history to display to user
     */


//    private String renderMashTable (App masterApp) {
//        List<String> columnNames = Arrays.asList(
//                "Number Of Kids: ",
//                "Salary Range: ",
//                "Job Title: ",
//                "Dream City: ",
//                "Dream Car: ");
//
//
//        List<List<String>> userValues = new ArrayList<>();
//        for (Category promise : promiseHistory.getPromises()) {
//            List<String> row = new ArrayList<>();
//            promiseRows.add(row);
//
//            if (promise.getPromiseEffectiveDate() != null) {
//                row.add(promise.getPromiseEffectiveDate().toLocalDateTime().toString());
//            } else {
//                row.add(null);
//            }
//            row.add(promise.getAsin());
//            row.add(promise.getCustomerOrderItemId());
//            row.add(promise.isActive() ? "Y" : "N");
//            if (promise.getPromiseLatestShipDate() != null) {
//                row.add(promise.getPromiseLatestShipDate().toLocalDateTime().toString());
//            } else {
//                row.add(null);
//            }
//            if (promise.getPromiseLatestArrivalDate() != null) {
//                row.add(promise.getPromiseLatestArrivalDate().toLocalDateTime().toString());
//            } else {
//                row.add(null);
//            }
//            if (promise.getDeliveryDate() != null) {
//                row.add(promise.getDeliveryDate().toLocalDateTime().toString());
//            } else {
//                row.add(null);
//            }
//            row.add(promise.getPromiseProvidedBy());
//            Integer confidence = promise.getConfidence();
//            if (confidence != null) {
//                row.add(confidence.toString());
//            } else {
//                row.add(null);
//            }
//        }
//
//        return new TextTable(columnNames, promiseRows).toString();
//    }
//
//    /**
//     * Generates the user-facing representation of the given order.
//     *
//     * @param order The Order to render to String for display in the UI
//     * @return The String representation of Order to display to user
//     */
//    private String renderOrderTable(Order order) {
//        List<String> columnNames = Arrays.asList(
//                "ORDER DATE", "ORDER ID", "MARKETPLACE", "TIMEZONE", "CONDITION", "SHIP OPTION", "CUSTOMER ID"
//        );
//
//        List<String> orderFields = new ArrayList<>();
//        if (order != null) {
//            if (order.getOrderDate() != null) {
//                orderFields.add(order.getOrderDate().toLocalDateTime().toString());
//            } else {
//                orderFields.add(null);
//            }
//            orderFields.add(order.getOrderId());
//            orderFields.add(order.getMarketplaceId());
//            if (order.getOrderDate() != null) {
//                orderFields.add(order.getOrderDate().getZone().toString());
//            } else {
//                orderFields.add(null);
//            }
//            if (order.getCondition() != null) {
//                orderFields.add(order.getCondition().toString());
//            } else {
//                orderFields.add(null);
//            }
//            orderFields.add(order.getShipOption());
//            orderFields.add(order.getCustomerId());
//        }
//
//        return new TextTable(columnNames, Arrays.asList(orderFields)).toString();
//    }
//
//    /**
//     * Asks user if they want to submit another request and return boolean indicating their answer.
//     *
//     * @return true if user has another order ID to request; false otherwise
//     */
//    @VisibleForTesting
//    boolean userHasAnotherRequest() {
//        String answer = inputHandler.getString(VALID_YES_NO_ANSWERS, CONTINUE_PROMPT, INLINE_PROMPT);
//        return answer.equals("y") || answer.equals("Y");
//    }
//
//    private String renderFixtures() {
//        return OrderDatastore.getDatastore().getOrderFixturesTable();
//    }
//}


}
