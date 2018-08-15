public class HourlyWorker implements Worker {
    private int ID;
    private String name;
    private double hourPay;
    private int hours;

    HourlyWorker(int ID, String name, double hourPay, int hours){
        this.ID = ID;
        this.name = name;
        this.hourPay = hourPay;
        this.hours = hours;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourPay() {
        return hourPay;
    }

    public void setHourPay(double hourPay) {
        this.hourPay = hourPay;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double pay() {

        return hourPay * hours;
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", hourPay=" + hourPay +
                ", hours=" + hours +
                '}';
    }
}
