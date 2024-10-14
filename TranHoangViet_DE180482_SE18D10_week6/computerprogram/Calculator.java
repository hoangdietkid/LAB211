package TranHoangViet_DE180482_SE18D10_week6.computerprogram;

/**
 * Calculator
 */
public class Calculator {
    public static InputData input = new InputData();

    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = input.checkInputDouble();
        return number;
    }

    public void nomarCal() {
        double memory;
        String operator;
        System.out.println("----- Normal Calculator ----- ");
        System.out.println("Enter number: ");
        memory = input.checkInputDouble();
        while (true) {
            System.out.println("Enter Operator: ");
            operator = input.checkInputOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                memory /= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                return;
            }
        }
    }

    public static void BMICalculator() {
        System.out.println("----- BMI Calculator ----- ");
        System.out.print("Enter Weight(kg): ");
        double weight = input.checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = input.checkInputDouble();
        double bmi = weight * 10000 / (height * height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }

    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }
}