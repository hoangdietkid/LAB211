package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model;

import java.util.ArrayList;

public class WorkerList {
    ArrayList<Worker> workerList = new ArrayList<>();

    public ArrayList<Worker> getWorkers() {
        return workerList;
    }

    public void setWorkers(ArrayList<Worker> workerList) {
        this.workerList = workerList;
    }

    public void addWorker(Worker worker) {
        workerList.add(worker);
    }

    public Worker findWorkerById(String id) {
        for (Worker worker : workerList) {
            if (worker.getId().equals(id)) {
                return worker;
            }
        }
        return null;
    }
}
