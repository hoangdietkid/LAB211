package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.View;

import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static TaskList_View taskList_View = new TaskList_View();
    public static Menu menu = new Menu();

    public static void main(String[] args) throws IOException, ParseException {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    taskList_View.addTask();
                    break;
                case 2:
                    taskList_View.delTask();
                    break;
                case 3:
                    taskList_View.showTaskView();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
            }
        }
    }
}
