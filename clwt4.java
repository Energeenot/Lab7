package Lab7;

public class clwt4 {
    public static void main(String[] args) {
        RationalNumber RatNumber1 = new RationalNumber(0, 5, 9);
        RationalNumber RatNumber2 = new RationalNumber(0, 3, 7);
        RatNumber1.RatNumMultiply(RatNumber2);
        RatNumber1.RatNumDivide(RatNumber2);
        RatNumber1.RatNumAdd(RatNumber2);
        RatNumber1.RatNumMinus(RatNumber2);
        System.out.println(RatNumber1.RatNumEquals(RatNumber2));
    }
}
