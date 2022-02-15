import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 number and program will print all even numbers between your numbers");
        printAllEvenNumbers(scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter 4 numbers start number, finish number, reminder , divider");
        printNumbersWithReminder(scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter 2 numbers and program will" +
                " print all numbers on the segment from a to b that are exact squares. ");
        printAllExactSquares(scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter 1 number and 1 digit " +
                " and program will print how many times second digit occures in first");
        printCountOfDigit(scanner.nextInt(),scanner.nextInt());

        System.out.println("Enter number and program will revers and print it");
        printReversNumber(scanner.nextInt());

        System.out.println("Enter number and program will find and print it smallest fivisor");
        printSmallestDivisor(scanner.nextInt());

        System.out.println("Enter number and program will print all natural divisors");
        printAllNaturalDivisors(scanner.nextInt());

        System.out.println("Enter number and program will print count of all natural divisors");
        printCountOfAllNaturalDivisors(scanner.nextInt());

        printSumOfInputNumbers();

        System.out.println("Enter binary number with max length 10 and program will it decimal value");
        convertAndPrintBinaryToDecimal(scanner.nextInt());

        printThreeCounters();

        System.out.println("Enter GNCHE-1 seconds");
        printGncheNumber(scanner.nextInt());

        System.out.println("Enter table size to print it");
        printTable1(scanner.nextInt());

        System.out.println("Enter table size to print it");
        printTable2(scanner.nextInt());

        System.out.println("Enter size of multiplication table");
        printMultiplicationTable(scanner.nextInt());

        System.out.println("Enter size of table");
        print4Tables(scanner.nextInt());
    }

    /**
     * task16
     * printing 4 variants of table from input size
     * @param num
     */
    private static void print4Tables(int num) {
        System.out.println("A.\n");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("B.\n");
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("C.\n");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("D.\n");
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * task15
     * Printing multiplication table from input size
     *
     * @param num
     */
    private static void printMultiplicationTable(int num) {
        int digit;
        System.out.print("*|  ");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("\n");

        for (int i = 0; i < num * 4 + 2; i++) {
            System.out.print("-");
        }

        for (int i = 1; i <= num; i++) {
            System.out.print("\n" + i + "|  ");
            digit = i;
            for (int j = 1; j <= num; j++) {
                System.out.print(digit + "\t");
                digit += i;
            }
        }
    }

    /**
     * task14
     * printing table NxN with this picture
     * # # #
     *  # # #
     * # # #
     *
     * @param size
     */
    private static void printTable2(int size) {
        for (int i = 0; i < size; i++) {
            if ((i & 1) == 1) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    /**
     * task13
     * printing table NxN with this picture
     * ****
     * ****
     * ****
     * ****
     *
     * @param size
     */
    private static void printTable1(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * task12
     * Printing GNCHE numbers
     *
     * @param seconds
     */
    private static void printGncheNumber(int seconds) {
        int count = 0;
        for (int digit = 0; digit <= seconds; digit++) {
            for (int digitNums = 0; digitNums < digit; digitNums++) {
                System.out.print(digit + " ");
                count++;
                if (count == seconds) break;
            }
            if (count == seconds) break;
        }
    }

    /**
     * task11
     * Inputting the number N, followed by N integers
     * printing count of zeros, positive numbers, negative numbers among the given N numbers.
     */
    private static void printThreeCounters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N, followed by N integers");
        int N = scanner.nextInt();
        int count0 = 0;
        int countPos = 0;
        int countNeg = 0;

        for (int i = 1; i <= N; i++) {
            System.out.println("Enter number " + i);
            int num = scanner.nextInt();
            if (num == 0) count0++;
            else if (num > 0) countPos++;
            else countNeg++;
        }
        System.out.println("Zero numbers = " + count0 + "\nPositive numbers = " + countPos + "\nNegative numbers = " + countNeg);
    }


    /**
     * task10
     * converting and printing binary number to decimal
     *
     * @param binaryNum
     */
    private static void convertAndPrintBinaryToDecimal(int binaryNum) {
        int count = 0;
        int decimalNum = 0;
        for (int i = binaryNum; i > 0; i /= 10) {
            if (i % 10 == 1) {
                decimalNum += Math.pow(2, count);
            }
            count++;
        }
        System.out.println(decimalNum);
    }

    /**
     * task9
     * printing sum of input 10 numbers
     */
    private static void printSumOfInputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers and program will print sum of them");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number - " + (i + 1));
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }

    /**
     * task8
     * printing count of all natural divisors of input number
     *
     * @param num
     */
    private static void printCountOfAllNaturalDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println("Divisors count = " + count);
    }

    /**
     * task7
     * printing all natural divisors of input number
     *
     * @param num
     */
    private static void printAllNaturalDivisors(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * task6
     * printing smallest divisor other than 1
     *
     * @param num
     */
    private static void printSmallestDivisor(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.println(num + " is simple number");
                    break;
                }
                System.out.println(i);
                break;
            }
        }
    }

    /**
     * task5
     * printing reversed input number without end zeroes
     *
     * @param num
     */
    private static void printReversNumber(int num) {
        //cutting zeroes from end
        while (num % 10 == 0) {
            num /= 10;
        }
        //reversing
        for (int i = num; i > 0; i /= 10) {
            System.out.print(i % 10);
        }
    }

    /**
     * task4
     * printing how many times digit occures in num
     *
     * @param num
     * @param digit
     */
    private static void printCountOfDigit(int num, int digit) {
        int count = 0;
        for (int i = num; i > 0; i /= 10) {
            if (i % 10 == digit) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * task3
     * printing all numbers in range start to end that have exact square
     *
     * @param startnum
     * @param endNum
     */
    private static void printAllExactSquares(int startnum, int endNum) {
        for (int i = endNum; i >= startnum; i--) {
            if ((int) Math.sqrt(i) * (int) Math.sqrt(i) == i) System.out.print(i + " ");
        }
    }

    /**
     * task2
     * printing all numbers that divided by 'devider' and they have 'reminder' reminder in range startNum to finishNum
     *
     * @param startNum
     * @param endNum
     * @param reminder
     * @param divider
     */
    private static void printNumbersWithReminder(int startNum, int endNum, int reminder, int divider) {
        if (divider == 0){
            System.out.println("Error , divided by zero ");
            return;
        }
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            if (i % divider == reminder) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) System.out.println("No numbers");
    }

    /**
     * task1
     * printing all even numbers between input numbers
     *
     * @param num1
     * @param num2
     */
    private static void printAllEvenNumbers(int num1, int num2) {
        for (int i = num1; i < num2; i++) {
            if ((i & 1) == 0) System.out.print(i + " ");
        }
    }
}
