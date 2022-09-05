package Lab7;

public class task1 {
    public static void main(String[] args) {
        Octahedron octahedron1 = new Octahedron();
        octahedron1.inputOctahedron();
        Octahedron octahedron2 = new Octahedron("Второй", 2);
        System.out.println("Площадь первого октаэдра " + octahedron1.Square());
        System.out.println("Объём первого октаэдра " + octahedron1.Volume());
        System.out.println("Площадь второго октаэдра " + octahedron2.Square());
        System.out.println("Объём второго октаэдра " + octahedron2.Volume());
        if (octahedron1.Volume() > octahedron2.Volume()){
            System.out.println("Название фигуры с наибольшим объёмом " + octahedron1.getName());
        } else {
            System.out.println("Название фигуры с наибольшим объёмом " + octahedron2.getName());
        }
        if ((octahedron1.Square() - 100) > (octahedron2.Square()))
            System.out.println("Площадь ближе к 100 у " + octahedron1.getName());
        else System.out.println("Площадь ближке к 100 у октаэдра под названием " + octahedron2.getName());
    }
}
