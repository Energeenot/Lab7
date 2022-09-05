package Lab7;

import java.util.Scanner;
// рабочий конструктор для 3-его номера, если нужно проверить работоспособность 1-2 задач, нужно закоментировать
public class RationalNumber {
    private int numerator;
    private int denominator;
    private int Whpart;

    // рабочий конструктор, если нужно проверить работоспособность 1-2 задач, нужно закоментировать
    public RationalNumber(int Whpart, int numerator, int denominator){
        this.Whpart = Whpart;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // констрор копирования, если нужно проверить работоспособность 1-2 задач, нужно закоментировать
    public RationalNumber(RationalNumber rationalNumber){
        this.numerator = rationalNumber.numerator;
        this.denominator = rationalNumber.denominator;
        this.Whpart = rationalNumber.Whpart;
    }

    RationalNumber(){}

    public void RatNumMultiply(RationalNumber RatNum2) {
        RationalNumber newRatNum = new RationalNumber(0, 0, 0);
        if (this.Whpart == 0 && RatNum2.getWhpart() == 0) {
            newRatNum = new RationalNumber(0, this.numerator * RatNum2.getNumerator(), this.denominator * RatNum2.getDenominator());
        }
        if (this.Whpart != 0 && RatNum2.getWhpart() != 0){
            newRatNum = new RationalNumber(0, (this.Whpart * this.denominator + this.numerator) * (RatNum2.getWhpart() * RatNum2.getDenominator() + RatNum2.getDenominator()), this.denominator * RatNum2.getDenominator());
        }
        if (this.Whpart == 0 && RatNum2.getWhpart() != 0){
            newRatNum = new RationalNumber(0, this.numerator * (RatNum2.getWhpart() * RatNum2.getDenominator() + RatNum2.getNumerator()), this.denominator * RatNum2.getDenominator());
        }
        if (this.Whpart != 0 && RatNum2.getWhpart() == 0){
            newRatNum = new RationalNumber(0, (this.Whpart * this.denominator + this.numerator) * RatNum2.getNumerator(), this.denominator * RatNum2.getDenominator());
        }
        newRatNum.printRatNumb();
    }

    public void RatNumDivide(RationalNumber RatNum2){
        RationalNumber newRatNum = new RationalNumber(0, 0, 0);
        if (this.Whpart == 0 && RatNum2.getWhpart() == 0){
            newRatNum = new RationalNumber(0, this.numerator * RatNum2.getDenominator(), this.denominator * RatNum2.getNumerator());
        }
        if (this.Whpart != 0 && RatNum2.getWhpart() != 0){
            newRatNum = new RationalNumber(0, (this.Whpart * this.denominator + this.numerator) * RatNum2.getDenominator(), this.denominator * (RatNum2.getWhpart() * RatNum2.getDenominator() + RatNum2.getNumerator()));
        }
        if (this.Whpart == 0 && RatNum2.getWhpart() != 0){
            newRatNum = new RationalNumber(0, this.numerator * RatNum2.getDenominator(), this.denominator * (RatNum2.getWhpart() * RatNum2.getDenominator() + RatNum2.getNumerator()));
        }
        if (this.Whpart != 0 && RatNum2.getWhpart() == 0){
            newRatNum = new RationalNumber(0, (this.Whpart * this.denominator + this.numerator) * RatNum2.getDenominator(), this.denominator * RatNum2.getNumerator());
        }
        newRatNum.printRatNumb();
    }

    public void RatNumAdd(RationalNumber RatNum2){
        RationalNumber newRatNum = new RationalNumber(0, this.numerator * RatNum2.getDenominator() + this.denominator * RatNum2.getNumerator(), this.denominator * RatNum2.getDenominator());
        newRatNum.printRatNumb();
    }

    public void RatNumMinus(RationalNumber RatNum2){
        RationalNumber newRatNum = new RationalNumber(0, this.numerator * RatNum2.getDenominator() - RatNum2.getNumerator() * this.denominator, this.denominator * RatNum2.getDenominator());
        newRatNum.printRatNumb();
    }

    public boolean RatNumEquals(RationalNumber RatNum2){
        if (this.Whpart == RatNum2.getWhpart() && this.numerator == RatNum2.getNumerator() && this.denominator == RatNum2.getDenominator()){
            return (true);
    } else{ return false;}
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        try {
            int n = numerator/denominator;
            this.denominator = denominator;
        } catch(ArithmeticException e){
            System.out.println("На ноль делить нельзя");
            System.out.println("Попробуйте снова");
            Runtime.getRuntime().exit(1);
        }
    }

    public int getNumerator(){
        return  numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public int getWhpart(){
        return Whpart;
    }

    public void inputRatNumb(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числитель");
        int numerator = scanner.nextInt();
        setNumerator(numerator);
        System.out.println("Введите знаменатель");
        int denominator = scanner.nextInt();
        setDenominator(denominator);
    }

    public int getWholePart(){
        return (int) numerator/denominator;
    }

    public int getRemains(){
        return (int) numerator % denominator;
    }

    public void printRatNumb() {
        while (true) {

            if (Whpart != 0) {
                System.out.println("число " + Whpart + " " + numerator + "/" + denominator);
                break;
            }
            if (numerator < denominator) {
                System.out.println("число " + numerator + "/" + denominator);
                break;
            }
            if (numerator > denominator) {
                System.out.println("число " + getWholePart() + " " + getRemains() + "/" + denominator);
                break;
            }

        }
    }

    public void nod(){
        int nod = 1;
        for (int i = 1; i <= Math.abs(numerator) && i <= Math.abs(denominator); i++){
            if (Math.abs(numerator) % i == 0 && Math.abs(denominator) % i == 0){
                nod = i;
            }
        }
        numerator = numerator / nod;
        denominator = denominator / nod;
    }
}
