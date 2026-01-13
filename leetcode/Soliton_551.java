package pdpuz;

public class Soliton_551 {
    public static void main(String[] args) {
        Soliton_551 soliton551 = new Soliton_551();

        String s = "PPALLL";
        System.out.println(soliton551.checkRecord(s));
    }

    public boolean checkRecord(String s) {
        int counterL = 0;
        int counterA = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                counterA++;
                if (counterA == 2) return false;
            }
            if (c == 'L') {
                counterL++;
                if (counterL == 3) return false;
            } else counterL = 0;

        }

        return true;
    }
}
