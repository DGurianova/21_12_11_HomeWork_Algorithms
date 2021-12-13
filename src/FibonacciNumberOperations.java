public class FibonacciNumberOperations {
    //Найти последнюю цифру числа фибоначи под номером до 2^31-1
    //Найти остаток от деления числа фибоначи под номером до 2^31-1 на положительное число m
    //найти НОД (нибольший общий делитель), найти НОК

    public long findFibonacciNumber(int n) {
        if (n > 0) {
            long n0 = 0;
            long n1 = 1;
            long fibonacciNumber = 0;
            for (int i = 3; i <= n; i++) {
                fibonacciNumber = n0 + n1;
                n0 = n1;
                n1 = fibonacciNumber;
            }
            return fibonacciNumber;
        }
        throw new IllegalArgumentException("The argument is wrong, it must be 1 and more");
    }


    public long getModuloFibonacciNumber(long fibonacciNumber, long m) {
        return fibonacciNumber % m;
    }

    public long findGreatestCommonDivisionTernOper(long fibonacciNumber, long m) {
        if (m >= 0) {
            return m == 0 ? fibonacciNumber : findGreatestCommonDivisionTernOper(m, fibonacciNumber % m);
        }
        throw new IllegalArgumentException("The argument is wrong, it must be positive.");
    }

    public long findGreatestCommonMultiple(long fibonacciNumber, long m, long greatestCommonDivision) {
        if (fibonacciNumber * m < fibonacciNumber) {
            throw new IllegalArgumentException("These arguments made long type overflow");
        }
        return (fibonacciNumber * m) / greatestCommonDivision;
    }
}


