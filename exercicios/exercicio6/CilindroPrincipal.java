import java.util.Scanner;

class Cilindro{
    double altura, raio;

    Cilindro(double x, double y){
        altura = x;
        raio = y;
    }
    double calcularArea(){
        return 2 * 3.14 * raio * (raio + altura);
    }
    double calcularVolume(){
        return 3.14 * raio * raio * altura;
    }
}

public class CilindroPrincipal {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura do cilindro: ");
        double altura = input.nextDouble();
        System.out.print("Digite o raio do cilindro: ");
        double raio = input.nextDouble();
        input.close();

        Cilindro obCilindro = new Cilindro(altura, raio);

        System.out.printf("Área do cilindro: %.2f\n", obCilindro.calcularArea());
        System.out.printf("Volume do cilindro: %.2f\n", obCilindro.calcularVolume());

    }
}
