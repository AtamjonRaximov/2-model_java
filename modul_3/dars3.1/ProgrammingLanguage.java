package pdpuz.modul3;

public class ProgrammingLanguage {
    String name ;
    String owner ;
    String releaseDate ;

    public ProgrammingLanguage(String name, String owner, String releaseDate) {
        this.name = name;
        this.owner = owner;
        this.releaseDate = releaseDate;
    }

    public void printInfo() {
        System.out.println("Name:" + name.toUpperCase());
        System.out.println("Owner:" + owner.toUpperCase());
        System.out.println("Name:" + releaseDate);
    }

    public static void main(String[] args) {
        ProgrammingLanguage prog1 = new ProgrammingLanguage("Atamjon",null,"12-oktabr");
        try {
            prog1.printInfo();
        }catch (NullPointerException e){
            System.out.println("Null qiymat kiritilgan null kiritish mumkin emas !!!  "+e.getMessage());
        }
        System.out.println("dastur davom etdi...");

    }

}
