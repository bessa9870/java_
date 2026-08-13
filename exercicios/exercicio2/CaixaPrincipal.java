import java.util.Scanner;

class Caixa {
    double largura;
    double altura;
    double profundidade;
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

        double volume = obCaixa.largura * obCaixa.altura * obCaixa.profundidade;
        double area = 2 * (obCaixa.largura * obCaixa.altura + obCaixa.largura * obCaixa.profundidade + obCaixa.altura * obCaixa.profundidade);
        
        System.out.printf("Volume da caixa: %.2f\n", volume);
        System.out.printf("Área da caixa: %.2f\n", area);
    }
}
