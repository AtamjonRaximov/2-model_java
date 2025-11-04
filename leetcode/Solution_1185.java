package pdpuz;


public class Solution_1185 {
    public static void main(String[] args) {
        Solution_1185 sol1 = new Solution_1185();

        System.out.println(sol1.dayOfTheWeek(31, 8, 2019));

    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int[] monthsDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int days = 0;

        for (int y = 1971; y < year; y++) {
            days += isLeap(y) ? 366 : 365;

        }

        for (int m = 0; m < month - 1; m++) {
            days += monthsDays[m];
            if (m == 1 && isLeap(year)) days += 1;
        }

        days += day - 1;

        return week[days % 7];

    }

    private boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
