import java.util.ArrayList;

public class Database {
    private ArrayList<Worker> workerArrayList = new ArrayList<>();

    void addWorker(Worker worker) throws IllegalArgumentException {
        if (isFreeID(worker.getID())) {
            workerArrayList.add(worker);
        } else {
            System.err.println("Работник с таким ID уже существует");
        }
    }

    void displayWorkers(){
        for (Worker w : workerArrayList
             ) {
            System.out.println(w.toString());
        }
    }


    boolean isFreeID(int ID){
        for(Worker w : workerArrayList){
            if (w.getID() == ID){
                return false;
            }
        }
        return true;
    }



}
