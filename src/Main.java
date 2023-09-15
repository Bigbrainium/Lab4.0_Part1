import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // ints
        int intOperandA = 12;
        int intOperandB = 12;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        // doubles
        double doubleOperandA = 24;
        double doubleOperandB = 24;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModul = doubleOperandA % doubleOperandB;

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is: " + intSum);
        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is: " + intDifference);
        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is: " + intProduct);
        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is: " + intQuotient);
        System.out.println("The module of " + intOperandA + " and " + intOperandB + " is: " + intModulo);

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleSum);
        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleDifference);
        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleProduct);
        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleQuotient);
        System.out.println("The module of " + doubleOperandA + " and " + doubleOperandB + " is: " + doubleModul);

    }
}