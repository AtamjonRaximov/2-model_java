package pdpuz;


public class app {
    public static void main(String[] args) {
        Vehicle malibu = new Malibu();
        malibu.drive();

        Vehicle spark = new Spark();
        spark.drive();

        Equipment wm = new WashingMachine();
        wm.use();

        Equipment tv = new Television();
        tv.use();
    }

}

