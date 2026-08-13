import java.util.Scanner;

class Caixa {
    double largura;
    double altura;
    double profundidade;

    double calcularVolume(){
        return largura * altura * profundidade;
    }
    double calcularArea(){
        return 2 * (largura * altura + largura * profundidade + altura * profundidade);
    }
}

public class CaixaPrincipal {
    static public void main(String[] args){
        Caixa obCaixa = new Caixa(); 
        Scanner input = new Scanner(System.in); 
        //System.in diz ao scanner para ler exclusivamente do teclado.

        System.out.print("Digite a largura da caixa:");
        obCaixa.largura = input.nextDouble();
        /*Convertendo a entrada do usuário para double, System.in só 
        retorna strings*/
        System.out.print("Digite a altura da caixa:");
        obCaixa.altura = input.nextDouble();
        System.out.print("Digite a profundidade da caixa:");
        obCaixa.profundidade = input.nextDouble();
        input.close();

        System.out.printf("Volume da caixa: %.2f\n", obCaixa.calcularVolume());
        System.out.printf("Área da caixa: %.2f\n", obCaixa.calcularArea());
    }
}
