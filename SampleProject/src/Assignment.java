import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Assignment {
    @Test
    public void TestcheckForPrime1() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(1);
        assertEquals(false, results);
    }

    @Test
    public void TestcheckForPrime2() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(2);
        assertEquals(true, results);
    }

    @Test
    public void TestcheckForPrime3() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(100);
        assertEquals(false, results);
    }

    @Test
    public void TestcheckForPrime4() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(99);
        assertEquals(false, results);
    }

    @Test
    public void TestcheckForPrime5() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(53);
        assertEquals(true, results);
    }

    @Test
    public void TestcheckForPrime6() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(0);
        assertEquals(false, results);
    }

    @Test
    public void TestcheckForPrime7() {
        PrimeNumberProgram primeNumberProgram = new PrimeNumberProgram();
        boolean results = primeNumberProgram.checkForPrime(101);
        assertEquals(true, results);
    }

    @Test
    public void TestcheckLeapYear1() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2000);
        assertEquals(true, rslt);
    }

    @Test
    public void TestcheckLeapYeartrue2() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2001);
        assertEquals(false, rslt);
    }

    @Test
    public void TestcheckLeapYear3() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2002);
        assertEquals(false, rslt);
    }

    @Test
    public void TestcheckLeapYeartrue4() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2053);
        assertEquals(false, rslt);
    }

    @Test
    public void TestcheckLeapYear5() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2099);
        assertEquals(false, rslt);
    }

    @Test
    public void TestcheckLeapYeartrue6() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2100);
        assertEquals(true, rslt);
    }

    @Test
    public void TestcheckLeapYear7() {
        LeapYear leapYear = new LeapYear();
        boolean rslt = leapYear.checkLeapYear(2101);
        assertEquals(false, rslt);
    }

    @Test
    public void Testcalculatesum1() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(0.00, 3.00);
        assertEquals(1.71, rslts, .2);
    }

    @Test
    public void Testcalculatesum2() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(1.00, 3.00);
        assertEquals(1.82, rslts, .5);
    }

    @Test
    public void Testcalculatesum3() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(2.00, 3.00);
        assertEquals(1.90, rslts, .2);
    }

    @Test
    public void Testcalculatesum4() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(10.00, 3.00);
        assertEquals(2.30, rslts, .5);
    }

    @Test
    public void Testcalculatesum5() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(11.00, 3.00);
        assertEquals(2.40, rslts, .2);
    }

    @Test
    public void Testcalculatesum6() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(9.00, 3.00);
        assertEquals(2.67, rslts, .5);
    }

    @Test
    public void Testcalculatesum7() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 0.00);
        assertEquals(1.90, rslts, .2);
    }

    @Test
    public void Testcalculatesum8() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 1.00);
        assertEquals(1.97, rslts, .5);
    }

    @Test
    public void Testcalculatesum9() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(100.00, 2.00);
        assertEquals(3.47, rslts, .5);
    }

    @Test
    public void Testcalculatesum10() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 4.00);
        assertEquals(2.14, rslts, .5);
    }

    @Test
    public void Testcalculatesum11() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 5.00);
        assertEquals(2.18, rslts, .2);
    }

    @Test
    public void Testcalculatesum12() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 6.00);
        assertEquals(2.22, rslts, .5);
    }

    @Test
    public void Testcalculatesum13() {
        Sum sum = new Sum();
        double rslts = sum.calculatesum(5.00, 3.00);
        assertEquals(2.09, rslts, .5);
    }

}
