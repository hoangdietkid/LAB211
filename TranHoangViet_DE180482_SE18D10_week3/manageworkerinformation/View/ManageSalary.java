package TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.View;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;

import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.SalaryHistory;
import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.SalaryHistoryList;
import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.Worker;
import TranHoangViet_DE180482_SE18D10_week3.manageworkerinformation.Model.WorkerList;

public class ManageSalary {
    public static WorkerList workerList = new WorkerList();
    public static SalaryHistoryList salaryhistoryList = new SalaryHistoryList();
    public static InputValid input = new InputValid();

    public void addWorker() {
        System.out.println("------- Add Worker ----------");
        while (true) {
            String id;
            while (true) {
                System.out.print("Enter ID: ");
                id = input.checkInputString();
                if (workerList.findWorkerById(id) != null) {
                    System.err.println("Id existed");
                    System.out.println("Enter gain: ");
                } else {
                    break;
                }
            }
            System.out.print("Enter Name: ");
            String name = input.checkInputString();
            System.out.print("Enter Age: ");
            int age = input.checkLimitInput(18, 50);
            System.out.print("Enter Salary: ");
            double salary = input.checkInputdouble();
            System.out.print("Enter Work Location: ");
            String workLocation = input.checkInputString();
            if (!input.checkDuplicate(id, name, age, workLocation, salary)) {
                System.err.println("Duplicate!");
                System.out.println("Enter again: ");
                continue;
            }

            Worker tempWorker = new Worker(id, name, age, workLocation, salary);
            workerList.addWorker(tempWorker);
            System.err.println("Add successful!");
            if (input.checkInputYN()) {
                return;
            }
        }
    }

    public void changeSalary(boolean check) throws ParseException {
        if (workerList.getWorkers().isEmpty()) {
            System.err.println("List is empty.");
            return;
        }
        System.out.println("Enter Code: ");
        String id = input.checkInputString();
        Worker worker = workerList.findWorkerById(id);
        if (worker == null) {
            System.out.println("Worker not exist");
        } else {
            double oldSalary = worker.getSalary();
            double newSalary;
            if (check) {
                System.out.println("Enter salary: ");
                newSalary = input.checkInputdouble();
                newSalary += oldSalary;
                SalaryHistory salaryHistory = new SalaryHistory(worker.getId(), newSalary, worker.getName(),
                        worker.getAge(), "UP", getCurrentDate());
                salaryhistoryList.addSalaryHis(salaryHistory);
            } else {
                while (true) {
                    System.out.println("Enter salary: ");
                    newSalary = input.checkInputdouble();
                    if (oldSalary < newSalary) {
                        System.err.println("Salary decrease must be less than current salary: ");
                        System.out.println("Enter again: ");
                    } else {
                        break;
                    }
                }
                newSalary = oldSalary - newSalary;
                SalaryHistory salaryHistory = new SalaryHistory(worker.getId(), newSalary, worker.getName(),
                        worker.getAge(), "DOWN", getCurrentDate());
                salaryhistoryList.addSalaryHis(salaryHistory);
            }
            worker.setSalary(newSalary);
            System.out.println("Update successful");
        }
    }

    public void printListHistory() {
        if (salaryhistoryList.getSalaryList().isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.printf("%-5s%-15s%-5s%-10s%-10s%-20s\n", "Code", "Name", "Age",
                "Salary", "Status", "Date");
        ArrayList<SalaryHistory> list = salaryhistoryList.getSalaryList();
        Collections.sort(list);
        for (SalaryHistory history : list) {
            printHistory(history);
        }
    }

    public void printHistory(SalaryHistory history) {
        System.out.printf("%-5s%-15s%-5d%-10.2f%-10s%-20s\n", history.getWorkerid(),
                history.getName(), history.getAge(), history.getNewsalary(),
                history.getStatus(), history.getDate());
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

}
