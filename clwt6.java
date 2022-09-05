package Lab7;

public class clwt6 {
    public static void main(String[] args) {
        RationalNumber newRatNum = new RationalNumber();
        RationalNumber[] A = new RationalNumber[5];
        System.out.println("Введите 5 рациональных чисел: ");
        for(int i = 0; i < 5; i++){
            A[i] = new RationalNumber();
            A[i].inputRatNumb();
        }
        newRatNum = A[1];
        System.out.println("Сумма чисел: ");
        for (int i = 1; i<5; i ++){
            newRatNum.RatNumAdd(A[i]);
        }
        System.out.println("Произведение чисел:");
        newRatNum = new RationalNumber(0, 3, 5);
        for (int i = 0; i<5; i ++){
            newRatNum.RatNumMultiply(A[i]);
        }
        int indexmax = 0;
        int indexmin = 0;
        for(int i = 0; i < 5; i++) {
            if (A[indexmax].getNumerator() * A[i].getDenominator() < A[i].getNumerator() * A[indexmax].getDenominator()) {
                indexmax = i;
            }else if (A[indexmin].getNumerator() * A[i].getDenominator() > A[i].getNumerator() * A[indexmin].getDenominator()){
                indexmin = i;
            }
        }
        System.out.println("Максимальное число: ");
        A[indexmax].printRatNumb();
        System.out.println("Минимальное число: ");
        A[indexmin].printRatNumb();
        System.out.println("Их разность: ");
        A[indexmax].RatNumMinus(A[indexmin]);
    }
}
