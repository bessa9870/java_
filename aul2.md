# PROGRAMAÇÃO ORIENTADA A OBJETOS

## Sobrecargas (Polimorfismo)

### Sobrecarga de métodos:
No JAVA a leitura de um método é feito por sua assinatura. A assinatura é composto pelo identificador do método e seus parâmetros. Observe:
```JAVA
double soma(double x, double y){
  return x+y;
}
int soma(int x, int y){
  return x+y;
}
```
Nesse trecho, temos dois nomes iguais, mas assinaturas diferentes. Viu? É simples.

### Sobrecarga de construtores:
A lógica é semelhante. Um construtor aloca o objeto na memória, usando a sobrecarga de construtores cria-se a possibilidade de inicializar uma classe de outras formas. Observe:
```JAVA
public class CalcularCaixa{
  double altura;
  double largura;
  double profundidade;
  CalcularCaixa(double x, double y, double z){  //Inicializa a caixa
    altura = x;
    largura = y;
    profundidade = z;
  }
  CalcularCaixa(double x){  //Inicializa uma caixa perfeita (quadrado)
    altura = x;
    largura = x;
    profundidade = x;
  }
}
```
*Eu achei desnecessário criar N construtores. Se o usuário quer calcular uma caixa perfeita, bastaria ele próprio entrar com valores idênticos, mas deve ter um uso já que essa possibilidade existe existe.*

## Modificadores static e final:

### final:
Quando eu declarava uma constante em C, usava #define CONSTANTE antes de quaisquer declarações. Para criar uma constante em JAVA o modificador é o **final**, isso cria um **atributo global e imutável** que 
será visível por todos as classes no programa contanto que sua classe esteja referenciada por um objeto.
```JAVA
static final PI = 3.14
```
### Static:
O **static** é quase como um parâmetro passado por valor do C. Ao criar um atributo static, nós damos origem a um atributo global, ele é acessível e passível de alteração por quaisquer objetos sem precisar 
de um objeto, mas diretamente pelo nome da classe.
```JAVA
static double areaQuadrado(double x){
	return x * x;
}
```
