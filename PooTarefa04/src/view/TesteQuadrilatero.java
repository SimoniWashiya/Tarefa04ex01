package view;

import model.Paralelogramo;
import model.Quadrilatero;
import model.Trapezio;

public class TesteQuadrilatero {
    public static void main(String[] args) {
        Quadrilatero paralelogramo = new Paralelogramo(5, 4);
        Quadrilatero trapezio = new Trapezio(10, 6, 4);

        System.out.println("�rea do Paralelogramo: " + paralelogramo.calcArea());
        System.out.println("Per�metro do Paralelogramo: " + paralelogramo.calcPerimetro());

        System.out.println("�rea do Trap�zio: " + trapezio.calcArea());
        System.out.println("Per�metro do Trap�zio: " + trapezio.calcPerimetro());
    }
}
