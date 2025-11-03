package pdpuz;

public class Solution_1154 {
    public static void main(String[] args) {
        Solution_1154 sol1 = new Solution_1154();
        System.out.println(sol1.dayOfYear("2019-01-09"));

    }

    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dayOfYear = 0;

        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonths[i];
        }

        dayOfYear += day;

        if (month > 2 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            dayOfYear += 1;
        }
        return dayOfYear;
    }
}
