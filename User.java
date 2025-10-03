public class User {
    private String Name;
    private String Surname;
    private int phonenumber;
    private int age;
    private boolean isMale;

    public User(String Name, String Surname, int phonenumber, int age, boolean isMale) {
        this.Name = Name;
        this.Surname = Surname;
        this.phonenumber = phonenumber;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public int getAge() {
        return age;
    }

    public boolean getisMale() {
        return isMale;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMale(boolean isMale) {
        this.isMale = isMale;
    }

    public void display() {
        System.out.println("Ismi: " + Name + " " + "Familyasi: " + Surname + " " + "yoshi: " + age + " "
                + "telefon raqami: " + phonenumber + " " + "jinsi:" + isMale);
    }

}
