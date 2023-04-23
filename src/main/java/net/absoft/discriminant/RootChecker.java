package net.absoft.discriminant;

public class RootChecker {

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 4;


        double D = (double) (Math.pow(b,2) - 4 * a * c);

        double x1 = (-b + Math.sqrt(D)) / (2*a);
        double x2 = (-b - Math.sqrt(D)) / (2*a);

        if (D > 0) {System.out.println("D = " + D); System.out.println("then x1 = " + x1 + ";  x2 = " + x2);
        }        else if (D == 0) {System.out.println("D = " + D); System.out.println("then x1 = x2 =" + x1);
        }        else if (D < 0) {System.out.println("D = " + D + " < 0 --> NULL");
        }
    }
}