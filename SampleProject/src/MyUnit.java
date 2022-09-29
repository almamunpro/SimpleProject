public class MyUnit {
    static boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;

        if (inputNumber <= 1) {
            isItPrime = false;

            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;

                    break;
                }
            }

            return isItPrime;
        }
    }

    public class Sum {
        public static double calculatesum(Double a, Double b) {
            double sum = a + b;
            sum = sum / 0.2;
            sum = Math.pow(sum, 0.2);
            return sum;
        }
    }
}