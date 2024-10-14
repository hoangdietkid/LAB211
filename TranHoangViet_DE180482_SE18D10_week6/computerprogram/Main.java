package TranHoangViet_DE180482_SE18D10_week6.computerprogram;

public class Main {
    public static Menu menu = new Menu();
    public static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        while (true) {
            int choice = menu.menu();
            switch (choice) {
                case 1:
                    calculator.nomarCal();
                    break;
                case 2:
                    Calculator.BMICalculator();
                    break;
                case 3:
                    System.out.println("Exitingggg");
                    System.exit(0);
                    break;

            }
        }
    }
}
