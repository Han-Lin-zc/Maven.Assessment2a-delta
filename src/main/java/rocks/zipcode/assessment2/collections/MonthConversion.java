package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {

    Map<Integer, String> month;

    public MonthConversion() {
        this.month = new HashMap<>();
    }
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        month.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        return month.get(monthNumber);
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        int result = 0;
        for (Map.Entry<Integer, String> entry : month.entrySet()) {
            if (entry.getValue().contains(monthName)) {
                result = entry.getKey();
            }
        }
        return result;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if (monthNumber > 0 && monthNumber < 13) {
            return true;
        }
        return false;
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return monthName.equals("January") || monthName.equals("February") ||
                monthName.equals("March") || monthName.equals("April") ||
                monthName.equals("May") || monthName.equals("June") ||
                monthName.equals("July") || monthName.equals("August") ||
                monthName.equals("September") || monthName.equals("October") ||
                monthName.equals("November") || monthName.equals("December");
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return month.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        getName(monthNumber);
        getNumber(monthName);
    }
}
