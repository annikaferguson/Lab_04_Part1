public class Main {
    public static void main(String[] args) {
        int intOperandA = 2;
        int intOperandB = 4;
        int intSum = 6;
        int intProduct = 8;
        int intDifference = 3;
        int intModulo = 1;

        double doubleOperandA = 2.0;
        double doubleOperandB = 4.0;
        double doubleSum = 4.5;
        double doubleProduct = 8.0;
        double doubleDifference = 1.5;
        double doubleQuotient = 3.4;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        intProduct = intOperandA * intOperandB;
        System.out.println("The product of using ints of " + intOperandA + " " + intOperandB + " is " intSum);
        intDifference = intOperandA - intOperandB;
        System.out.println("The difference of using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);
        intModulo = intOperandA / intOperandB;
        System.out.println("The % modulo of using ints of " + intOperandA + " " intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);
        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);
        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);
        doubleQuotient = doubleOperandA - doubleOperandB;
        System.out.println("The quotient of using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        int kidsinFamily = 2;
        boolean isItRaining = true;
        double gasPricePerGallon = 4.15;
        int myFavoriteNumber = 2;
        double myShoeSize = 6.0;
        int myBirthMonth = 7;
        String myFullName = "Annika Naima Ferguson";

        System.out.println("The number of kids in my family is " + kidsinFamily);
        System.out.println("Is it Raining? " + isItRaining);
        System.out.println("The gas price per gallon is " + gasPricePerGallon);
        System.out.println("My favorite number is " + myFavoriteNumber);
        System.out.println("My shoe size is " + myShoeSize);
        System.out.println("My birth month is " + myBirthMonth);
        System.out.println("My full name is " + myFullName);


    }
}