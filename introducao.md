[RetanguloPrincipal.java](https://github.com/user-attachments/files/30987374/RetanguloPrincipal.java)# PROGRAMAÇÃO ORIENTADA A OBJETOS

## Classes, objetos e métodos:

### Paradigma orientado a objetos:
Na programação existem diferentes modos que podemos adotar para resolver problemas e estruturas sistemas, chamamos isso de: **Paradigmas de programação**. A programação orientada a objetos é um desses paradigmas. Ele foca em juntar todos os dados e funções que seriam independentes, e encapsulá-los dentro de classes, tratando-os como atributos(variáveis)e métodos(funções de processamento) membros da classe.

### Classes:
Pegando de uma perspectiva de alguém que veio do C puro: Uma classe é uma struct bufada que declara as variáveis e também contêm os funções(métodos) que iram trabalhar com essas variáveis. Na programação orientada a objetos dá pra definir uma classe facilmente como: **Construção lógica que define um objeto**. Em Java, tudo obrigatoriamente deve estar encapsulado em uma classe, e a identificação da classe principal deve levar o mesmo nome do arquivo .java onde está a classe principal.
*(Naturalmente, uma classe não ocupa espaço na memória RAM tal qual uma struct.)*
  - Variáveis dentro de uma classe são chamados: **Variáveis de instância/Atributos**;
  - Os métodos e variáveis definidas em uma classe são chamados de **membros da classe**.
  - Já dentro das classes, **todo código deve estar dentro de um método**, nada fica solto como na programação sequencial onde bastava seguir a ordem.

### Objeto:
O objeto é tão simples quanto, em C, ele seria a variável declarada na main que é do tipo struct. Na programação orientada a objetos a definição seria: **A instância física da classe**, essa instância é uma variável do tipo <classe> que pode acessar as variáveis e métodos dentro da classe. Em Java você cria o objeto e seguidamente, o aloca na memória RAM usando o parâmetro **new**:
  1. <classe>  <nome_objeto>;  //Aqui você cria a instância (**Variável de referência**:guarda um objeto.)
  2. <nome_objeto> **new** <construtor()>;  //Aqui você aloca na memória
  3. <classe> <nome_projeto> new <construtor()>;  //Também da pra fazer tudo numa linha só

| Classe | Objeto |
| :-- | :-- |
| Um formulário vazio | O formulário preenchido |
| A planta baixa de uma casa | A casa construída |
| Uma fórmula somar dois números (n + n) | A soma implementada (1 + 2) |

[Uploading RetanguloPrincipapackage exercicio1;

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
}l.java…]()
