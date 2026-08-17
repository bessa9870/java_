import java.util.Scanner;

class Caixa{
    double largura;
    double altura;
    double profundidade;
    
    Caixa(){    //Construtor sem parâmetros
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com a largura: ");
        largura = in.nextDouble();
        System.out.println("Entre com a altura: ");
        altura = in.nextDouble();
        System.out.println("Entre com a profundidade: ");
        profundidade = in.nextDouble();
    }
    Caixa(double x, double y, double z){    //Construtor com parâmetros
        largura = x;
        altura = y;
        profundidade = z;
    }
    double calcularVolume(){    //Método calcularVolume sem parametros
        return largura * altura * profundidade;
    }
    double calcularVolume(double x, double y, double z){    //Método calcularVolume com parâmetros
        return x * y * z;
    }
    double calcularArea(){    //Método calcularArea sem parametros  
        return 2 * (largura * altura + largura * profundidade + altura * profundidade);
    }
    double calcularArea(double x, double y, double z){  //Método calcularArea com parâmetros
        return 2 * (x * y + x * z + y * z);
    }
}

public class CaixaSobrecarga{
    static public void main(String[] args){
        Caixa obCaixa = new Caixa();
        System.out.println("Volume da caixa: " + obCaixa.calcularVolume());
        System.out.println("Área da caixa: " + obCaixa.calcularArea());

        Scanner in = new Scanner(System.in);
        System.out.println("Entre com a largura: ");
        double largura = in.nextDouble();
        System.out.println("Entre com a altura: ");
        double altura = in.nextDouble();
        System.out.println("Entre com a profundidade: ");
        double profundidade = in.nextDouble();
        in.close();

        obCaixa = new Caixa(largura, altura, profundidade);
        System.out.println("Volume da caixa: " + obCaixa.calcularVolume());
        System.out.println("Área da caixa: " + obCaixa.calcularArea());
    }
}

