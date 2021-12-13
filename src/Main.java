public class Main {
    public static void main(String[] args) {
        FibonacciNumberOperations fibonacciNumberOperations = new FibonacciNumberOperations();

        int n = (int) Math.pow(2, 31 - 1); // 2 to the 31-1 power
        System.out.println("2 to the 31-1 power is " + n);
        int m = 9;

        long fibonacciNumber = fibonacciNumberOperations.findFibonacciNumber(n); //6796685077251819234
        System.out.println(fibonacciNumber);
        System.out.println(fibonacciNumberOperations.getModuloFibonacciNumber(fibonacciNumber, m)); //6
        long greatestCommonDivision = fibonacciNumberOperations.findGreatestCommonDivisionTernOper(fibonacciNumber, m);//3
        System.out.println(greatestCommonDivision);
        System.out.println(fibonacciNumberOperations.findGreatestCommonMultiple(fibonacciNumber, m, greatestCommonDivision));//"1943311158045906086" - Exception in thread "main" java.lang.IllegalArgumentException: These arguments made long type overflow

    }
}
