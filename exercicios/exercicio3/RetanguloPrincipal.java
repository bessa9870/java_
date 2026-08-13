class Retangulo{
    double largura, altura;

    double getLargura(){
        return largura;
    }
    double getAltura(){
        return altura;
    }
    double calcularDiagonal(){
        return Math.sqrt((largura * largura) + (altura * altura));
    }
}

public class RetanguloPrincipal{
    static public void main(String[] args){
        Retangulo obRetangulo;  // Crio a variável de referência
        obRetangulo = new Retangulo();  // Crio o objeto

        obRetangulo.largura = 5.0;
        obRetangulo.altura = 10.0;

        System.out.printf("Largura: %.2f\n", obRetangulo.getLargura());
        System.out.printf("Altura: %.2f\n", obRetangulo.getAltura());
        System.out.printf("Diagonal: %f\n",obRetangulo.calcularDiagonal());
    }
}