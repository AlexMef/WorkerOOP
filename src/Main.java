import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String action;
        Scanner in = new Scanner(System.in);
        Database database = new Database();
        database.addWorker(new HourlyWorker(0, "Name",1300, 3));
        database.addWorker(new FixedWorker(1, "Namae", 1000));

        do {
            System.out.println("Select action - add, remove, display");
            action = in.next().toLowerCase();
            switch (action) {
                case "add":
                    System.out.println("Select worker - Hourly or Fixed");
                    String selectWorker = in.next().toLowerCase();
                    int ID;
                    String name;
                    double hourPay;
                    double fixedPay;
                    int hours;

                    try {
                        if (selectWorker.equals("hourly")) {
                            System.out.println("Enter ID");
                            ID = in.nextInt();
                            System.out.println("Enter name");
                            name = in.next();
                            System.out.println("Enter hour pay");
                            hourPay = in.nextDouble();
                            System.out.println("Enter hours count");
                            hours = in.nextInt();
                            database.addWorker(new HourlyWorker(ID, name, hourPay, hours));
                        } else if (selectWorker.equals("fixed")) {
                            System.out.println("Enter ID");
                            ID = in.nextInt();
                            System.out.println("Enter name");
                            name = in.next();
                            System.out.println("Fixed pay");
                            fixedPay = in.nextDouble();
                            database.addWorker(new FixedWorker(ID, name, fixedPay));
                        }
                    } catch (InputMismatchException e){
                        System.err.println("Data is incorrect");
                    }
                    break;
                case "display":
                    database.displayWorkers();
                    break;
            }
        } while (!action.equals("quit"));
    }
}
