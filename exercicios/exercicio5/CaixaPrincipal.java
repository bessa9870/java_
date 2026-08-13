class Caixa {
    double largura;
    double altura;
    double profundidade;

    Caixa(double x, double y, double z){
        largura = x;
        altura = y;
        profundidade = z;
    }
    void inicializar(double x, double y, double z){
        largura = x;
        altura = y;
        profundidade = z;
    }
    double calcularVolume(){
        return largura * altura * profundidade;
    }
    double calcularArea(){
        return 2 * (largura * altura + largura * profundidade + altura * profundidade);
    }
}

public class CaixaPrincipal {
    static public void main(String[] args){
        Caixa obCaixa = new Caixa(4,5,6); 

        System.out.printf("Volume da caixa: %.2f\n", obCaixa.calcularVolume());
        System.out.printf("Área da caixa: %.2f\n\n", obCaixa.calcularArea());

        System.out.print("Agora, inicializando os atributos com outros valores\n\n");
        obCaixa.inicializar(7,8,9);

        System.out.printf("Volume da caixa: %.2f\n", obCaixa.calcularVolume());
        System.out.printf("Área da caixa: %.2f\n", obCaixa.calcularArea());
    }
}

