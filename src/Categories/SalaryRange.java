package Categories;

import java.util.HashSet;

public class SalaryRange {

    public int salaryRange;
    public int counter;
    public static HashSet<Integer> salaryRangeSet;

    public SalaryRange(int salaryRange) {
        this.salaryRange = salaryRange;
        Integer salaryRangeInteger = (Integer) salaryRange;
        salaryRangeSet = new HashSet<>();
        salaryRangeSet.add(salaryRangeInteger);

    }

    public void counterMethod() {
        counter = 0;
        try {
            for (Integer salaryRangeInteger : salaryRangeSet) {
                counter = +1;
                String.format("You currently have provided %s entries. " +
                        "You will need to enter 4.", salaryRangeSet.size());
            }

        } catch (IndexOutOfBoundsException e) {
            if (counter > 4) {
                System.out.println("Error! You have exceeded the " +
                        "amount of entries for this category, only 4 entries are allowed.");
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public int getSalaryRange() {
        return salaryRange;
    }

    public void setSalaryRange(int salaryRange) {
        this.salaryRange = salaryRange;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public static HashSet<Integer> getSalaryRangeSet() {
        return salaryRangeSet;
    }

    public static void setSalaryRangeSet(HashSet<Integer> salaryRangeSet) {
        SalaryRange.salaryRangeSet = salaryRangeSet;
    }
}












