package pdpuz;

public class Solution_434 {
    public static void main(String[] args) {
        Solution_434 solution434 = new Solution_434();

        String s = "";
        System.out.println(solution434.countSegments(s));

    }

    public int countSegments(String s) {
        if (s==null ||s.trim().isEmpty()) return 0;
        String[] strings = s.split(" ");
        int counter = 0;

        for (String string : strings) {
            if (!string.isEmpty())counter++;

        }

        return counter;
    }
}
