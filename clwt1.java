package Lab7;

public class clwt1 {
    public static void main(String[] args) {
        RationalNumber ratNumbFir = new RationalNumber();
        RationalNumber ratNumbSec = new RationalNumber();
        ratNumbFir.inputRatNumb();
        ratNumbSec.inputRatNumb();
        ratNumbFir.printRatNumb();
        ratNumbSec.printRatNumb();
        System.out.println("Числители " + ratNumbFir.getNumerator() + ", " + ratNumbSec.getNumerator());
        System.out.println("Сумма знаменателей = " + (ratNumbFir.getDenominator() + ratNumbSec.getDenominator()));
        if (ratNumbFir.getNumerator() > ratNumbSec.getNumerator()){
            ratNumbFir.printRatNumb();
        }
        else {ratNumbSec.printRatNumb();}
//         задание 2
//        числа сокращены если это возможно
        ratNumbFir.nod();
        ratNumbSec.nod();
        ratNumbFir.printRatNumb();
        ratNumbSec.printRatNumb();
    }
}
