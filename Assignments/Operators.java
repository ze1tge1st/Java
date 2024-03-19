public class Operators {

    public static void main(String[] args) {

        // Initial Variable
        int x;

        // First ex: x = 2
        x = 2;
        System.out.println("Original value: " + x + " (" + Integer.toBinaryString(x) + ")");
        x = x << 1; // Predicted decimal value: 4, Binary string: 100
        System.out.println("After left shift by 1: " + x + " (" + Integer.toBinaryString(x) + ")");

        // Second example: x = 9
        x = 9;
        System.out.println("\nOriginal value: " + x + " (" + Integer.toBinaryString(x) + ")");
        x = x << 1; // Predicted decimal value: 18, Binary string: 10010
        System.out.println("After left shift by 1: " + x + " (" + Integer.toBinaryString(x) + ")");

        // Third example: x = 17
        x = 17;
        System.out.println("\nOriginal value: " + x + " (" + Integer.toBinaryString(x) + ")");
        x = x << 1; // Predicted decimal value: 34, Binary string: 100010
        System.out.println("After left shift by 1: " + x + " (" + Integer.toBinaryString(x) + ")");

        // Fourth example: x = 88
        x = 88;
        System.out.println("\nOriginal value: " + x + " (" + Integer.toBinaryString(x) + ")");
        x = x << 1; // Predicted decimal value: 176, Binary string: 10110000

        System.out.println("After left shift by 1: " + x + " (" + Integer.toBinaryString(x) + ")");

        //

        // Declare and initialize variable x
        int     y;

        // First example: x = 150
        y = 150;
        System.out.println("Original value: " + y + " (" + Integer.toBinaryString(y) + ")");
        // Predicted decimal value after right shift by 2: 37
        // Predicted binary string after right shift by 2: 100101
        y = y >> 2;
        System.out.println("After right shift by 2: " + y + " (" + Integer.toBinaryString(y) + ")");

        // Second example: y = 225
        y = 225;
        System.out.println("\nOriginal value: " + y + " (" + Integer.toBinaryString(y) + ")");

        // Third example: y = 1555

        y = 1555;
        System.out.println("\n0riginal value: " + y + " (" + Integer.toBinaryString(y) + ")");

        y = 32456;

        System.out.println("\nOriginal value; " + y + "(" + Integer.toBinaryString(y) + ")");

        // Predicted decimal value after right shift by 2: 56
        // Predicted binary string after right shift by 2: 111000
        y = y >> 2;
        System.out.println("After right shift by 2: " + y + " (" + Integer.toBinaryString(y) + ")");


        //declare initial variable

        // Declare and initialize variables
        int a = 7;
        int b = 17;
        int c;

        // Predict result of bitwise AND operation: 1
        c = a & b;

        // Print out the result
        System.out.println("Result of bitwise AND operation on " + a + " and " + b + " is: " + c);
        System.out.println("Binary representation of result: " + Integer.toBinaryString(c));

        //predict result of bitwise OR operation: 23

        c = a | b;

        //Print

        System.out.println("Result of bitwise OR operation on " + a + " and " + b + " is : " + c);
        System.out.println("Binary representation of result: " + Integer.toBinaryString(c));

        // Declare and initialize an integer variable
        int number = 5;

        // Print the value before the increment operator
        System.out.println("Value before increment: " + number);

        // Use the postfix increment operator to increase the value
        number++;

        // Print the value after the increment operator
        System.out.println("Value after increment: " + number);

        // Method 1: Using the increment operator ++
        System.out.println("Method 1:");
        System.out.println("Original value: " + number);
        number++;
        System.out.println("Value after increment: " + number);

        // Method 2: Using the compound assignment operator +=
        System.out.println("\nMethod 2:");
        System.out.println("Original value: " + number);
        number += 1;
        System.out.println("Value after increment: " + number);

        // Method 3: Using the addition operator +
        System.out.println("\nMethod 3:");
        System.out.println("Original value: " + number);
        number = number + 1;
        System.out.println("Value after increment: " + number);



        // Declare and initialize integer variables
        int d = 5;
        int e = 8;

        // Using prefix increment op
        int sum1 = ++d + e; // Increment x first, then calculate sum
        System.out.println("Using prefix increment operator (++x): Sum = " + sum1); // Output: 14

        // Reset x and y
        d = 5;
        e = 8;

        // Using postfix increment op
        int sum2 = d++ + e; // Calculate sum, then increment d
        System.out.println("Using postfix increment operator (x++): Sum = " + sum2); // Output: 13






    }
}
