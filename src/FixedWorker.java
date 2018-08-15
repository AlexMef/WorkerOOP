public class FixedWorker implements Worker {
    private int ID;
    private String name;
    private double fixedPay;

    public FixedWorker(int ID, String name, double fixedPay) throws IllegalArgumentException{
        this.ID = ID;
        this.name = name;
        this.fixedPay = fixedPay;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFixedPay() {
        return fixedPay;
    }

    public void setFixedPay(double fixedPay) {
        this.fixedPay = fixedPay;
    }

    @Override
    public double pay() {

        return fixedPay;
    }

    @Override
    public String toString() {
        return "FixedWorker{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", fixedPay=" + fixedPay +
                '}';
    }
}
