public class Main {

    public static void main(String[] args) {

        // Using int
        int intOperandA = 10;
        int intOperandB = 5;
        int intSum = intOperandA + intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); // Output statement
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct); // Output statement
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); // Output statement
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Output statement
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo + "\n"); // Output statement

        // Using double
        double doubleOperandA = 10.5;
        double doubleOperandB = 5.5;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The sum using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Output statement
        System.out.println("The product using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Output statement
        System.out.println("The difference using double of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Output statement
        System.out.println("The quotient using double of " + doubleOperandA + " and " + intOperandB + " is " + doubleQuotient); // Output statement
        System.out.println("The modulo using double of " + doubleOperandA + " and " + intOperandB + " is " + doubleModulo + "\n"); // Output statement

        // Question 12 of the lab
        int kidsInFam = 4;
        String isRaining = "no";
        double gallonGasPrice = 3.02;
        int myFavNum = 13;
        double myShoeSize = 11.5;
        String myBirthMonth = "July";
        String myFullName = "Kaden Jain";
        // begin outputs
        System.out.println("The number of kids in my family is: " + kidsInFam);
        System.out.println("Is it raining? The answer is: "+ isRaining);
        System.out.println("The cost of a gallon of gas today is: $" + gallonGasPrice);
        System.out.println("My favorite number is: " + myFavNum);
        System.out.println("My shoe size is: " + myShoeSize);
        System.out.println("My birth Month is: " + myBirthMonth);
        System.out.println("My full name is: " + myFullName);
    }

}