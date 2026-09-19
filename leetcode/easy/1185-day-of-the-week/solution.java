import java.time.LocalDate;
// This allows us to use Java's LocalDate class.

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        //Create the date -> LocalDate.of(2019, 8, 31)
        LocalDate date = LocalDate.of(year, month, day);

        //Get the day of the week .toString() -> converts it into a String.
        String result = date.getDayOfWeek().toString();
        // result = "SATURDAY" but here case sensitive -> substring(start, end) takes part of a String.
        //Starting from index 1 until the end: "ATURDAY" -> .toLowerCase() -> "Saturday"
        return result.substring(0, 1) + result.substring(1).toLowerCase();
    }
}