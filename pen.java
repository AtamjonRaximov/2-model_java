public class pen {
    private int Miqdor;
    private boolean Clicked;
    private int OneLetter;

    public pen(int Miqdor, boolean Clicked, int OneLetter) {
        this.Miqdor = Miqdor;
        this.Clicked = Clicked;
        this.OneLetter = OneLetter;
    }

    public int getMiqdor() {
        return Miqdor;
    }

    public int getOneLetter() {
        return OneLetter;
    }

    public boolean getClicked() {
        return Clicked;
    }

    public void setClicked(boolean clicked) {
        Clicked = clicked;
    }

    public void setMiqdor(int miqdor) {
        Miqdor = miqdor;
    }

    public void setOneLetter(int oneLetter) {
        OneLetter = oneLetter;
    }

    public void write(String str) {
        if (!Clicked) {
            System.out.println("ruchka bosilmagan yozib bo'lmaydi!!");
            return;

        }

        StringBuffer written = new StringBuffer();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                written.append(ch);
                continue;

            }
            int cost;
            
            if (Character.isUpperCase(ch)) {
                cost = OneLetter * 2;

            } else {
                cost = OneLetter;
            }

            if (Miqdor >= cost) {
                written.append(ch);
                Miqdor -= cost;
            } else {
                System.out.println(written);
                System.out.println("siyoh tugadi!!");
                break;
            }

        }
    }

}
