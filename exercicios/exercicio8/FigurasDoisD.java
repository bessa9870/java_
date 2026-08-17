class Figuras{
    static final double PI = 3.1415;
    
    static double areaCirculo(double raio){
        return PI * raio * raio;
    }
    static void areaCirculo(float raio){
        System.out.printf("Área do círculo: %.2f%n", (PI * raio * raio));
    }
    static double areaQuadrado(double lado){
        return lado * lado;
    }
    static void areaQuadrado(float lado){
        System.out.printf("Área do quadrado: %.2f%n", (lado * lado));
    }
}
public class FigurasDoisD {
    static public void main(String[] args){
        double raio = 5.0;
        double areaC = Figuras.areaCirculo(raio);
        System.out.printf("Área do círculo: %.2f%n", areaC);
        float raio2 = 7.0f;
        Figuras.areaCirculo(raio2);

        double lado = 4.0;
        double areaQ = Figuras.areaQuadrado(lado);
        System.out.printf("Área do quadrado: %.2f%n", areaQ);
        float lado2 = 6.0f;
        Figuras.areaQuadrado(lado2);
    }
}
