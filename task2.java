package Lab7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        Octahedron[] array = new Octahedron[scanner.nextInt()];
        for (int i = 0; i < array.length; i++){
            array[i] = new Octahedron();
            array[i].inputOctahedron();
        }
        System.out.println("Данные о фигруе с наибольшим именем");
        array[Octahedron.searchMaxName(array)].printOctahedron();
        Octahedron n = new Octahedron(array[array.length-1]);
        Octahedron b = new Octahedron(n.getName(),n.getSide() * 2);
        System.out.println("Все данные фигуры, полученноой путем увелечения линейных объемов в два раза посл элемента массива");
        System.out.println(b.getName());
        System.out.println(b.Volume());
        System.out.println(b.Square());
        for (int i = 0; i < array.length; i++){
            System.out.println("Площадь " + (i + 1) + " фигуры");
            System.out.println(array[i].Square());
        }
        array[Octahedron.searchMinSquare(array)].setName("MIN" + array[Octahedron.searchMinSquare(array)].getName());
        array[Octahedron.searchMinSquare(array)].printOctahedron();
        int count = 0;
        for (Octahedron octahedron : array) {
            if (octahedron.Square() > 15) {
                count++;
            }
        }
        System.out.println("Количество фигур с площадью больше 15 = " + count);
        double sumVolume = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println("Объём " + (i + 1) + " фигуры");
            System.out.println(array[i].Volume());
            sumVolume += array[i].Volume();
        }
        System.out.println("Сумма всех объёмов = " + sumVolume);
    }
}
