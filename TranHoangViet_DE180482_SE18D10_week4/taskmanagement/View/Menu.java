package TranHoangViet_DE180482_SE18D10_week4.taskmanagement.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "========= Task program ========= \r\n" + //
                    "1. Add Task \r\n" + //
                    "2. Delete task \r\n" + //
                    "3. Display Task \r\n" + //
                    "4. exit "
    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 5);
        return result;
    }
}
