public class PrimeNumberProgram {
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

    static boolean checkLeapYear(int year) {
        boolean isItleapyear = false;
        if (year % 400 == 0 || year % 100 == 0 || year % 4 == 0) {
            isItleapyear = true;
            return isItleapyear;
        } else {
            return isItleapyear;
        }

    }

}
