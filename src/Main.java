public class Main {
    public static void main(String[] args) {
        short s1 = 99, s2 = 99;
        float f1, f2;
        byte b = -10;
        boolean q = true;

        s1 = (short)Math.pow(b, 2);
        s2 = (short)(Math.random() * 10);
        double d2 = Math.random() * (9999 - 1) + 1;
        double d1 = d2 / s1 * s2;
        System.out.println(d1);
    }
}