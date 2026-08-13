class Retangulo{
    double largura, altura;
}

public class RetanguloPrincipal{
    static public void main(String[] args){
        Retangulo obRetangulo;  // Instâncio o objeto da classe Retangulo
        obRetangulo = new Retangulo();  // Crio o objeto

        obRetangulo.largura = 5.0;  // Acesso os atributos da classe usando o objeto
        obRetangulo.altura = 10.0;

        double area = obRetangulo.largura * obRetangulo.altura;  // Calculo a área do retângulo
        double diagonal = Math.sqrt((obRetangulo.largura * obRetangulo.largura) + (obRetangulo.altura * obRetangulo.altura));  // Calculo a diagonal do retângulo

        System.out.printf("largura %.2f\nAltura %.2f\n", obRetangulo.largura, obRetangulo.altura);
        System.out.printf("Área do retângulo: %.2f\n", area);
        System.out.printf("Diagonal do retângulo: %.2f\n", diagonal);
    }
}