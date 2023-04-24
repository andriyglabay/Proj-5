package net.absoft.discriminant;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RootCheckerTest {

    @Test
    public void discriminantPositive() {
        int a = -3;
        int b = 5;
        int c = -2;
        double m1 = 0.6666666666666666;
        double m2 = 1.0;

        double D = (double) (Math.pow(b,2) - 4 * a * c);
        double x1 = (-b + Math.sqrt(D)) / (2*a);
        double x2 = (-b - Math.sqrt(D)) / (2*a);

        Assert.assertTrue(D > 0, "equation has 2 real roots");
        Assert.assertEquals(x1, m1);
        Assert.assertEquals(x2, m2);

    }

    @Test
    public void discriminantZero() {
        int a = 1;
        int b = -2;
        int c = 1;
        double n = 1.0;

        double D = (double) (Math.pow(b,2) - 4 * a * c);
        double x = (-b + Math.sqrt(D)) / (2*a);

        Assert.assertTrue(D==0, "equation has 1 real root");
        Assert.assertEquals(x, n);
    }

    @Test
    public void discriminantNegative() {
        int a = 4;
        int b = 3;
        int c = 1;

        double D = (double) (Math.pow(b,2) - 4 * a * c);
        double x1 = (-b + Math.sqrt(D)) / (2*a);
        double x2 = (-b - Math.sqrt(D)) / (2*a);

        Assert.assertTrue(D < 0, "equation does not have real roots");
        Assert.assertTrue(Double.isNaN(x1));
        Assert.assertTrue(Double.isNaN(x2));
    }
}
