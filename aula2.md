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
É claro que aqui isso parece desnecessário, por que eu criaria N formas de se inicializar as variáveis de instância de uma classe só para usar a inicialização direta? Acontece que, na vida real nem sempre temos apenas uma opção de entrada. Um dos exemplos mais simples é um login. É bem habitual termos várias opções de login:
	1. Podemos criar uma conta, digitando um email, nome de usuário e senha;
	2. Criar uma conta usando o endereço de email;
	3. Criar uma conta usando o Facebook.

No próprio GitHub nós temos essas opções, claro que, o construtor correto a ser utilizado será implementado através das estruturas condicionais if/else.
```JAVA
int opcaoEscolhida = 1; 

Usuario novoUsuario;

if (opcaoEscolhida == 1) {
    // Usuário clicou em "Continuar com Google"
    // O sistema aciona o construtor de 1 parâmetro
    novoUsuario = new Usuario(tokenRecebido); 
} else {
    // Usuário preencheu o formulário completo
    // O sistema aciona o construtor de 3 parâmetros
    novoUsuario = new Usuario(emailDigitado, senhaDigitada, nomeDigitado); 
}
```

## Modificadores static e final:

### final:
O modificador `final` transforma uma variável de instância numa constante. O valor da constante é único para cada objeto, por exemplo o CPF, data de nascimento, placa de veículo. Trazendo o conceito de um assunto que eu estou estudando agora: final seria o **Identificador único*** de uma entidade.
```JAVA
class Pessoa {
    final String cpf;
    String nome;

    Pessoa(String cpfDigitado, String nomeDigitado) {
        this.cpf = cpfDigitado; // Aqui o CPF é travado para sempre neste objeto.
        this.nome = nomeDigitado;
    }
}
```
Como visto a cima, não há problema declarar a constante vazia, contanto que ela vá ser iniciada em um construtor, uma vez definido o valor da fina, o JAVA não aceitará em hipótese alguma, uma mudança nesse valor, resultando em erro de compilação.

### Static:
O `static` é quase como um parâmetro passado por referência em C. Ao criar um atributo estático, cria-se uma única cópia do que estiver a direta do modificador, todas as classes e objetos em qualquer lugar do projeto compartilharam essa mesma cópia como um ponteiro, uma variável passada por valor para várias structs, onde quer que eu altere essa variável, essa alteração terá escopo global. Quando se cria um método estático, não é necessário instanciar um objeto da classe onde o método estático está, basta acessar o método usando o nome da classe.
```JAVA
class Quadrado{
	static double areaQuadrado(double x){
		return x * x;
	}
}
...
// Em outra classe ou na classe principal:
double areaQ = Quadrado.areaQuadrado(x);
```
## Criando uma constante global:
Quando eu declarava uma constante global em C, usava `#define CONSTANTE` antes de quaisquer declarações. Para criar uma constante em JAVA juntamos os dois modificadores `static final constante`, isso cria um **atributo global e imutável** que será visível por todos as classes no programa contanto que esteja dentro de uma classe.
```JAVA
static final PI = 3.14
...
// Em outra classe ou na classe principal:
ClasseGenerica.PI	// Acessa a constante.
```
Mas, por que usar o `static` na frente do `final`? De fato, ele é **imutável**, mas cada nova instância da classe vai criar uma cópia da constante. Se você criar 1000 instâncias, terá 1000 cópias. Então, para anular essa característica, usamos a característica única do `static` que transforma o que estiver na sua direta em uma única cópia.
