package pdpuz.Person;

public class person {
    protected String name;
    public String phone;
    private String password;

    public person(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void reset(String oldpassword, String newpassword){
        if (this.password.equals(oldpassword)){
            setPassword(newpassword);
            System.out.println("password has sucsesfully changed!!");
        }else {
            System.out.println("old password incorect!!");
        }
    }
}
