package factorial;

public class Main {
    public static void main(String[] args) {
        long factorial = Factorial.calculateFactorial(5);
        System.out.println(factorial);

        double term = Factorial.calculateFactorialReciprocalWithTerm(5);
        System.out.println(term);

        double episilon = Factorial.episilon(5, 2);
        System.out.println(episilon);
    }
}
