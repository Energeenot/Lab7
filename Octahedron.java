package Lab7;

import java.util.Scanner;

public class Octahedron {
    private String name;
    private int side;

    Octahedron(String name, int side){
        this.name = name;
        this.side = side;
    }

    Octahedron(Octahedron octahedron){
        this.name = octahedron.name;
        this.side = octahedron.side;
    }0
    Octahedron(){}

    public static int searchMaxName(Octahedron[] array ){
        int res = 0;
        String result = array[0].getName();
        for(int i = 0; i < array.length; i++){
            if(result.length()<array[i].getName().length()){
                result = array[i].getName();
                res = i;
            }
        }
        return res;
    }

    public static  int searchMinSquare(Octahedron[] array){
        int res = 0;
        double square = array[0].Square();
        for (int i = 0; i < array.length; i++){
            if (square > array[i].Square()){
                square = array[i].Square();
                res = i;
            }
        }
        return res;
    }

    public double Square(){
        return (2 * side * side * Math.sqrt(3));
    }

    public double Volume(){
        return (Math.pow(side, 3) * Math.sqrt(2) / 3);
    }


    public void inputOctahedron(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название октаэдра");
        String name = scanner.nextLine();
        setName(name);
        System.out.println("Введите величину стороны октаэдра");
        int side = scanner.nextInt();
        setSide(side);
    }

    public void printOctahedron(){
        System.out.println("Название октаэдра - " + name);
        System.out.println("Величина стороны октаэдра = " + side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
