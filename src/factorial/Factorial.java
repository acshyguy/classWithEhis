package factorial;

public class Factorial {
    public static long calculateFactorial(int number){
        long factorial = 1;
        if (number <= 0){
            factorial = 0;
            System.out.println("Number is either 0 or negative");

        } else{
            while(number >= 1){
                factorial = factorial * number;
                number = number - 1;
            }
        }
        return factorial;
    }

    public static double calculateFactorialReciprocalWithTerm(int numTerms){
        long numerator = 1;
        long denominator = 0;
        int count = 1;
        double term = 0;

        while (count <= numTerms){
            if (count == 1){
                term = term + 1;
            } else{
                denominator = calculateFactorial(count-1);
                term = term + numerator/(denominator*1.0);
            }
            count = count + 1;
        }
        return term;
    }

    public static double episilon(int numTerms, int x){
        long denominator = 0;
        int count = 1;
        double term = 0;

        while (count <= numTerms){
            if (count == 1){
                term = term + 1;
            } else {
                term = term +  Math.pow(x, count-1)/calculateFactorial(count-1);
            }
            count = count + 1;
        }
        return term;
    }
}
