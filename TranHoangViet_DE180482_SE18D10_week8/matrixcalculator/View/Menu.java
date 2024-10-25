package TranHoangViet_DE180482_SE18D10_week8.matrixcalculator.View;

public class Menu {
    InputValid input = new InputValid();
    String[] menu = {
            "====== Calculator program =====\r\n" + //
                    "1. Addition Matrix\r\n" + //
                    "2. Subtraction Matrix\r\n" + //
                    "3. Multiplication Matrix\r\n" + //
                    "4. Exit"
    };

    public int menu() {
        for (String temp : menu) {
            System.out.println(temp);
        }
        System.out.println("Enter your choice: ");
        int result = input.checkLimitInput(1, 4);
        return result;
    }
}
