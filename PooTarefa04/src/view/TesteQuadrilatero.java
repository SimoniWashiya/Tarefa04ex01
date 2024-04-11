package view;

import model.Paralelogramo;
import model.Quadrilatero;
import model.Trapezio;

public class TesteQuadrilatero {
    public static void main(String[] args) {
        Quadrilatero paralelogramo = new Paralelogramo(5, 4);
        Quadrilatero trapezio = new Trapezio(10, 6, 4);

        System.out.println("Área do Paralelogramo: " + paralelogramo.calcArea());
        System.out.println("Perímetro do Paralelogramo: " + paralelogramo.calcPerimetro());

        System.out.println("Área do Trapézio: " + trapezio.calcArea());
        System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());
    }
}
