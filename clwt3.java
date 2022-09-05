package Lab7;

public class clwt3 {

    public static void main(String[] args) {
        RationalNumber RatNumber1 = new RationalNumber(0, 4, 3);
        RationalNumber RatNumber2 = new RationalNumber(0, 1, 7);
        RationalNumber RatNumber3 = new RationalNumber(RatNumber1);
        RatNumber1.printRatNumb();
        RatNumber2.printRatNumb();
        RatNumber3.printRatNumb();
        System.out.println("в числитель первого числа записали 5");
        RatNumber1.setNumerator(5);
        RatNumber1.printRatNumb();
        System.out.println("увеличил знаменатель первого числа 3 раз");
        RatNumber1.setDenominator(RatNumber1.getDenominator() * 3);
        RatNumber1.printRatNumb();
        System.out.println("уменьшил числитель второго числа на 2");
        RatNumber2.setNumerator(RatNumber2.getNumerator() / 2);
        System.out.println("Из-за того что числитель второго числа равен 1, прога ничего не выводит");
        System.out.println("увеличить числитель третьего числа на 10, знаменатель в 10 раз");
        RatNumber3.setNumerator(RatNumber3.getNumerator() + 10);
        RatNumber3.setDenominator(RatNumber3.getDenominator() * 10);
        RatNumber3.printRatNumb();
    }
}
