package TranHoangViet_DE180482_SE18D10_week6.computerprogram;

public class Menu {
    InputData input = new InputData();
    String[] menu = {
            "========= Calculator Program ========= \r\n" + //
                    "1. Normal Calculator \r\n" + //
                    "2. BMI Calculator \r\n" + //
                    "3. Exit \r\n" //
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
